package com.kodilla.testing.shape;

import org.junit.Ignore;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for demove and add")
    class AddandRemove {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle();
            //When
            shapeCollector.addFigure(shape);
            //then
            Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle();
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);


        }
    }
    @Nested
    @DisplayName("Tests for get and show")
    class GetAndShow {

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle();
            shapeCollector.addFigure(shape);
            //When
            int shapeResult = shapeCollector.getFigure(1);
            //Then
            Assertions.assertEquals(1, shapeResult);

        }

        @Ignore
        @Test
        public void testShowFigures(){


            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square();
            shapeCollector.addFigure(shape);
            ArrayList<Shape> shapeList= new ArrayList<>();
            shapeList.add(shape);
            //When
            List<Shape> shapeResultList = shapeCollector.getShapeCollection();
            //Then
            Assertions.assertEquals(shapeList.toString(), shapeResultList.toString());
        }
    }
}
