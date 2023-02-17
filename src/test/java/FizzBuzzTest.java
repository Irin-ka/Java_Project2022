import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    // 1.Positive testing Happy path
    // if (start <= end)
    // return array;

    //start < end
     @Test  //обязательно прописываем данную аннотацию

    public void testStartLessThanEnd_HappyPath() {   // здесь пишем, что именно тестируем, начиная со слова test
         //AAA
         //Arrange
         int start = 1;
         int end = 20;
         String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                 "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
         //Act
         String[] actualResult = new FizzBuzz().fizzBuzz(start, end);      //создаем объект класса, в котором лежит метод и вызываем метод(после точки)

         //Assert
         Assert.assertEquals(actualResult, expectedResult);  //Assert - встроенный метод

     }

    //start == end
    @Test  //обязательно прописываем данную аннотацию

    public void testStartEqualsEnd_HappyPath() {   // здесь пишем, что именно тестируем, начиная со слова test
        //AAA
        //Arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};
        //Act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);      //создаем объект класса, в котором лежит метод и вызываем метод(после точки)

        //Assert
        Assert.assertEquals(actualResult, expectedResult);  //Assert - встроенный метод

    }

    // if (start > end)
    // return array;

    //@Ignore //Данная аннотация игнорирует провередние теста
    @Test  //обязательно прописываем данную аннотацию

    public void testStartLessThanEnd_StartEndAreNegative_HappyPath() {   // здесь пишем, что именно тестируем, начиная со слова test
        //AAA
        //Arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11", "Buzz", "Fizz", "-8",
                "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};
        //Act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);      //создаем объект класса, в котором лежит метод и вызываем метод(после точки)

        //Assert
        Assert.assertEquals(actualResult, expectedResult);  //Assert - встроенный метод

    }

    // 2.Negative testing Happy path
    // if (start > end)
    // return array;
    @Test  //обязательно прописываем данную аннотацию
    public void testStartGreaterThanEnd_Negative() {   // здесь пишем, что именно тестируем, начиная со слова test
        //AAA
        //Arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};
        //Act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);      //создаем объект класса, в котором лежит метод и вызываем метод(после точки)

        //Assert
        Assert.assertEquals(actualResult, expectedResult);  //Assert - встроенный метод

    }
}
