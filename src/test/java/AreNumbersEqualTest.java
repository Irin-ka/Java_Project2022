import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.AreNumbersEqual;

public class AreNumbersEqualTest {

    @Test
    public void firstNumberMoreThenSecond() {

        int a = 89;
        int b = -89;
        int expectedResult = 1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void firstNumberLessThenSecond() {

        int a = -89;
        int b = 89;
        int expectedResult = -1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void firstNumberSecond() {

        int a = 89;
        int b = 89;
        int expectedResult = 0;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
