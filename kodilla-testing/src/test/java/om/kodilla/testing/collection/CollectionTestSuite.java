package om.kodilla.testing.collection;
import java.util.*;





import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {



    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    @DisplayName("testing empty list")
    public void testOddNumbersExterminatorEmptyList(){
        //Given

        ArrayList<Integer> emptyList = new ArrayList<>();

        List<Integer> resultList = OddNumbersExterminator.exterminate(emptyList);
      //  System.out.println(oddNumbersExterminator.exterminate(emptyList));
        Assertions.assertEquals(resultList ,emptyList);

    }


    @Test
    @DisplayName("testing normal list")
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(5);
        normalList.add(2);
        normalList.add(1);
        normalList.add(4);
        normalList.add(10);

        ArrayList<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(10);
        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(normalList);
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}
