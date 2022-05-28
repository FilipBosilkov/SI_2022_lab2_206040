import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2Test {
    private List<String> createList(String... elems)
    {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementTaste()
    {
        //[1, 0, 1, #, 2, #, 1, 1, #]
        //[1, 0, 1, #, 2, #, #, 1, 1]
        List<String> emptylist = new ArrayList<>();
        List<String> wronglist = new ArrayList<>();
        wronglist.add("#");wronglist.add("0");wronglist.add("#");
        List<String> rightlist = Arrays.asList("0","0","0","#","0","#","0","0","#");
        List<String> expectedList1 = Arrays.asList("1", "0", "1", "#", "2", "#", "1", "1", "#");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            SILab2.function(emptylist);
        });
        String expectedMessage = "List length should be greater than 0";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
            SILab2.function(wronglist);
        });
        String expectedMessage2 = "List length should be a perfect square";
        String actualMessage2 = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

        assertEquals(expectedList1, SILab2.function(rightlist));
    }


    @Test
    void EveryBranchTest()
    {
        //[1, 0, 1, #, 2, #, 1, 1, #]
        //[1, 0, 1, #, 2, #, #, 1, 1]
        List<String> emptylist = new ArrayList<>();
        List<String> wronglist = new ArrayList<>();
        wronglist.add("#");wronglist.add("0");wronglist.add("#");
        List<String> rightlist = Arrays.asList("0","0","0","#","0","#","0","0","#");
        List<String> rightlist2 = Arrays.asList("0","0","0","#","0","#","#","0","0");
        List<String> expectedList1 = Arrays.asList("1", "0", "1", "#", "2", "#", "1", "1", "#");
        List<String> expectedList2 = Arrays.asList("1", "0", "1", "#", "2", "#", "#", "1", "1");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            SILab2.function(emptylist);
        });
        String expectedMessage = "List length should be greater than 0";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
            SILab2.function(wronglist);
        });
        String expectedMessage2 = "List length should be a perfect square";
        String actualMessage2 = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

        assertEquals(expectedList1, SILab2.function(rightlist));
        assertEquals(expectedList2, SILab2.function(rightlist2));
    }
}

