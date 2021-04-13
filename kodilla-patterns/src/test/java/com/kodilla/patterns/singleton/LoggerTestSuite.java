package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openSettings() {
        logger = Logger.INSTANCE;
        logger.log("Log");
    }

    @Test
    void Test_Logger() {

        //Given
        //When
        String resultLog = logger.getLastLog();
        //Then
        assertEquals("Log",resultLog);

    }
}
