import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.IsPositiveNumber;

public class IsPositiveNumberTest {

    //1. num > 0
    @Test
    public void numMoreThenZero_Happy() {

        int num = 555;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. num < 0
    @Test
    public void numLessThenZero_Happy() {

        int num = -555;
        boolean expectedResult = false;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //1. num = 0
    @Test
    public void numZero_Happy() {

        int num = 0;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
