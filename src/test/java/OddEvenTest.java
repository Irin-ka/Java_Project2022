import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    //1. number is odd
    @Test
    public void odd() {
        int num = -3;
        String expectedResult = "Odd";
        String actualResult = new OddEven().oddEven(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. number is even
    @Test
    public void even() {
        int num = 6;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //3. number = 0
    @Test
    public void evenZero() {
        int num = 0;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(num);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
