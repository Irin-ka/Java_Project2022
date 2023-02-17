import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.MultipleM;

public class MultipleMTest {

    @Test
    public void multipleOfSevenAndNine () {

        int m = 63;
        String expectedResult = "Good Number";
        String actualResult = new MultipleM().multipleM(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multipleOnlyNine () {

        int m = 72;
        String expectedResult = "Bad Number";
        String actualResult = new MultipleM().multipleM(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multipleOnlyEleven () {

        int m = 66;
        String expectedResult = "Poor Number";
        String actualResult = new MultipleM().multipleM(m);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multipleAnyCondition () {

        int m = 53;
        String expectedResult = "-1";
        String actualResult = new MultipleM().multipleM(m);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
