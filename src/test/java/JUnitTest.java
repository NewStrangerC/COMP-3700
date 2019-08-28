import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTest {
    @Test
    public void test_maxFind(){
        int[] intArray = new int[] {23, 42, 17, 50, 44};
        int[] emptyArray = new int[0];
        int[] nullArray = null;
        Integer expectedValue = 50;
        Integer actualValue = Finder.findMax(intArray);
        assertEquals(expectedValue, actualValue);
        expectedValue = null;
        actualValue = Finder.findMax(emptyArray);
        assertEquals(expectedValue, actualValue);
        expectedValue = null;
        actualValue = Finder.findMax(nullArray);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void test_minFind(){
        int[] intArray = new int[] {23, 42, 17, 50, 44};
        int[] emptyArray = new int[0];
        int[] nullArray = null;
        Integer expectedValue = 17;
        Integer actualValue = Finder.findMin(intArray);
        assertEquals(expectedValue, actualValue);
        expectedValue = null;
        actualValue = Finder.findMin(emptyArray);
        assertEquals(expectedValue, actualValue);
        expectedValue = null;
        actualValue = Finder.findMin(nullArray);
        assertEquals(expectedValue, actualValue);
    }
}
