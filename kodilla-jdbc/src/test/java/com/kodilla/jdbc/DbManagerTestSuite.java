package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {

        //Given
        //Then
        DbManager dbManager = DbManager.getInstance();
        //When
        Assertions.assertNotNull(dbManager.getConnection());

    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS " +
                "";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

         //Then
         int counter = 0;
         while (rs.next()) {
             System.out.println(rs.getInt("ID") + ", " +
                     rs.getString("FIRSTNAME") + ", " +
                     rs.getString("LASTNAME"));
             counter++;
         }
         rs.close();
         statement.close();
         assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS USER_POSTS\n" +
                "FROM USERS U JOIN POSTS P on U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getInt("USER_POSTS"));
            counter++;
        }
        rs.close();
        statement.close();
        Assertions.assertEquals(1, counter);
    }
}



















