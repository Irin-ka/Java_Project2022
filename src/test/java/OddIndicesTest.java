import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {
    //1.
    @Test
    public void testOddIndicesTest_HappyPath(){
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        int[] actualResult = new OddIndices().oddIndices(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.One
    @Test
    public void testOddIndicesTest_ArrayOfOne(){
        int[] array = {-45};
        int[] expectedResult = {};
        int[] actualResult = new OddIndices().oddIndices(array);
        Assert.assertEquals(actualResult, expectedResult);

    }
    //3.Empty
    @Test
    public void testOddIndicesTest_Empty(){
        int[] array = {};
        int[] expectedResult = {};
        int[] actualResult = new OddIndices().oddIndices(array);
        Assert.assertEquals(actualResult, expectedResult);

    }
}
