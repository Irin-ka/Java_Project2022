import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.BiggerValue;

public class BiggerValueTest {

    //1. b > a
    @Test
    public void testBiggerValue_b() {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;
        int actualResult = new BiggerValue().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
    //2. b < a
    @Test
    public void testBiggerValue_a() {
        int a = 999;
        int b = 333;
        int expectedResult = 999;
        int actualResult = new BiggerValue().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
    //3. b = a
    @Test
    public void testBiggerValue_ab() {
        int a = 4444;
        int b = 4444;
        int expectedResult = 4444;
        int actualResult = new BiggerValue().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
