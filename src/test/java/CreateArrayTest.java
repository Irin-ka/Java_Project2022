import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.CreateArray;

public class CreateArrayTest {

    @Test
    public void createArray() {

        int l = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new CreateArray().createIntArray(l);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
