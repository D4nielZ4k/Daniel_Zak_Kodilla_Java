package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.LibraryUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
public class CoutingStatisticsTestSuite {
    @Mock
      private  Statistics statistics;



    @Test
    void value_posts_zero(){
        //Given
        CoutingStatistics coutingStatistics = new CoutingStatistics(statistics);
        List<String> names = new ArrayList<>();
        names.add("czesio");
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(2);
        when(statistics.usersNames()).thenReturn(names);
        //When
        coutingStatistics.calculateAdvStatistics(statistics);
        int valuesUsers = coutingStatistics.getValuesUsers();
        int valuesUsersPosts = coutingStatistics.getValuesUsersPosts();
        int valuesUserComments = coutingStatistics.getValuesUserComments();

        double averagePostPerUser = coutingStatistics.getAveragePostPerUser();
        double averageCommentPerPost = coutingStatistics.getAverageCommentPerPost();
        double averageCommentPerUser = coutingStatistics.getAverageCommentPerUser();
        //Then
        Assertions.assertEquals(1,valuesUsers);
        Assertions.assertEquals(0,valuesUsersPosts);
        Assertions.assertEquals(2,valuesUserComments);
        Assertions.assertEquals(0,averagePostPerUser);
        Assertions.assertEquals(0,averageCommentPerPost);
        Assertions.assertEquals(0,averageCommentPerUser);
    }

    @Test
    void value_posts_thousand (){
        //Given
        CoutingStatistics coutingStatistics = new CoutingStatistics(statistics);
        List<String> names = new ArrayList<>();
        names.add("czesio");

        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(5000);
        when(statistics.usersNames()).thenReturn(names);
        //When
        coutingStatistics.calculateAdvStatistics(statistics);
        int valuesUsers = coutingStatistics.getValuesUsers();
        int valuesUsersPosts = coutingStatistics.getValuesUsersPosts();
        int valuesUserComments = coutingStatistics.getValuesUserComments();

        double averagePostPerUser = coutingStatistics.getAveragePostPerUser();
        double averageCommentPerPost = coutingStatistics.getAverageCommentPerPost();
        double averageCommentPerUser = coutingStatistics.getAverageCommentPerUser();
        //Then
        Assertions.assertEquals(1,valuesUsers);
        Assertions.assertEquals(1000,valuesUsersPosts);
        Assertions.assertEquals(5000,valuesUserComments);


        Assertions.assertEquals(1000,averagePostPerUser);
        Assertions.assertEquals(5,averageCommentPerPost);
        Assertions.assertEquals(5000,averageCommentPerUser);


    }

    @Test
    void value_users_comments_zero (){
        //Given
        CoutingStatistics coutingStatistics = new CoutingStatistics(statistics);
        List<String> names = new ArrayList<>();
        names.add("czesio");

        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(names);
        //When
        coutingStatistics.calculateAdvStatistics(statistics);
        int valuesUsers = coutingStatistics.getValuesUsers();
        int valuesUsersPosts = coutingStatistics.getValuesUsersPosts();
        int valuesUserComments = coutingStatistics.getValuesUserComments();

        double averagePostPerUser = coutingStatistics.getAveragePostPerUser();
        double averageCommentPerPost = coutingStatistics.getAverageCommentPerPost();
        double averageCommentPerUser = coutingStatistics.getAverageCommentPerUser();
        //Then
        Assertions.assertEquals(1,valuesUsers);
        Assertions.assertEquals(1000,valuesUsersPosts);
        Assertions.assertEquals(0,valuesUserComments);


        Assertions.assertEquals(1000,averagePostPerUser);
        Assertions.assertEquals(0,averageCommentPerPost);
        Assertions.assertEquals(0,averageCommentPerUser);




    }
    @Test
    void value_users_comments_smaller_value_post (){
        //Given
        CoutingStatistics coutingStatistics = new CoutingStatistics(statistics);
        List<String> names = new ArrayList<>();
        names.add("czesio");
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(250);
        when(statistics.usersNames()).thenReturn(names);
        //When
        coutingStatistics.calculateAdvStatistics(statistics);
        int valuesUsers = coutingStatistics.getValuesUsers();
        int valuesUsersPosts = coutingStatistics.getValuesUsersPosts();
        int valuesUserComments = coutingStatistics.getValuesUserComments();

        double averagePostPerUser = coutingStatistics.getAveragePostPerUser();
        double averageCommentPerPost = coutingStatistics.getAverageCommentPerPost();
        double averageCommentPerUser = coutingStatistics.getAverageCommentPerUser();
        //Then
        Assertions.assertEquals(1,valuesUsers);
        Assertions.assertEquals(1000,valuesUsersPosts);
        Assertions.assertEquals(250,valuesUserComments);


        Assertions.assertEquals(1000,averagePostPerUser);
        Assertions.assertEquals(0.25,averageCommentPerPost);
        Assertions.assertEquals(250,averageCommentPerUser);

    }
    @Test
    void value_users_comments_bigger_value_post (){
        //Given
        CoutingStatistics coutingStatistics = new CoutingStatistics(statistics);
        List<String> names = new ArrayList<>();
        names.add("czesio");
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(1100);
        when(statistics.usersNames()).thenReturn(names);
        //When
        coutingStatistics.calculateAdvStatistics(statistics);
        int valuesUsers = coutingStatistics.getValuesUsers();
        int valuesUsersPosts = coutingStatistics.getValuesUsersPosts();
        int valuesUserComments = coutingStatistics.getValuesUserComments();

        double averagePostPerUser = coutingStatistics.getAveragePostPerUser();
        double averageCommentPerPost = coutingStatistics.getAverageCommentPerPost();
        double averageCommentPerUser = coutingStatistics.getAverageCommentPerUser();
        //Then
        Assertions.assertEquals(1,valuesUsers);
        Assertions.assertEquals(1000,valuesUsersPosts);
        Assertions.assertEquals(1100,valuesUserComments);


        Assertions.assertEquals(1000,averagePostPerUser);
        Assertions.assertEquals(1.1,averageCommentPerPost);
        Assertions.assertEquals(1100,averageCommentPerUser);

    }
    @Test
    void value_users_zero (){

            //Given
            CoutingStatistics coutingStatistics = new CoutingStatistics(statistics);
            List<String> names = new ArrayList<>();

            when(statistics.postsCount()).thenReturn(10);
            when(statistics.commentsCount()).thenReturn(50);
            when(statistics.usersNames()).thenReturn(names);
            //When
            coutingStatistics.calculateAdvStatistics(statistics);
            int valuesUsers = coutingStatistics.getValuesUsers();
            int valuesUsersPosts = coutingStatistics.getValuesUsersPosts();
            int valuesUserComments = coutingStatistics.getValuesUserComments();

            double averagePostPerUser = coutingStatistics.getAveragePostPerUser();
            double averageCommentPerPost = coutingStatistics.getAverageCommentPerPost();
            double averageCommentPerUser = coutingStatistics.getAverageCommentPerUser();
            //Then
            Assertions.assertEquals(0,valuesUsers);
            Assertions.assertEquals(10,valuesUsersPosts);
            Assertions.assertEquals(50,valuesUserComments);

            Assertions.assertEquals(0,averagePostPerUser);
            Assertions.assertEquals(0,averageCommentPerPost);
            Assertions.assertEquals(0,averageCommentPerUser);

    }
    @Test
    void value_users_hundred (){

            //Given
            CoutingStatistics coutingStatistics = new CoutingStatistics(statistics);
            List<String> names = usersGenerator(1000);

            when(statistics.postsCount()).thenReturn(7500);
            when(statistics.commentsCount()).thenReturn(75000);
            when(statistics.usersNames()).thenReturn(names);
            //When
            coutingStatistics.calculateAdvStatistics(statistics);
            int valuesUsers = coutingStatistics.getValuesUsers();
            int valuesUsersPosts = coutingStatistics.getValuesUsersPosts();
            int valuesUserComments = coutingStatistics.getValuesUserComments();

            double averagePostPerUser = coutingStatistics.getAveragePostPerUser();
            double averageCommentPerPost = coutingStatistics.getAverageCommentPerPost();
            double averageCommentPerUser = coutingStatistics.getAverageCommentPerUser();
            //Then
            Assertions.assertEquals(1000,valuesUsers);
            Assertions.assertEquals(7500,valuesUsersPosts);
            Assertions.assertEquals(75000,valuesUserComments);


            Assertions.assertEquals(7.5,averagePostPerUser);
            Assertions.assertEquals(10,averageCommentPerPost);
            Assertions.assertEquals(75,averageCommentPerUser);

        }

    private  List<String> usersGenerator(int usersQantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQantity; n++) {
            resultList.add("User");
        }
        return resultList;
    }

}
