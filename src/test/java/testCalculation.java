import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testCalculation {

    @DataProvider(name = "testCalculation")
    public Object[][] testCalculation() {
        return new Object[][]{{1,2,3},
                {2,5,7},
                {10,2,12},
                {100,52,152},
                {-50,2,-48},
                {-1,3,2}};
    }


    @Test (dataProvider = "testCalculation")
    public void testCalculation(int x, int y, int expectedResult){
        //Arrange
        Calculation calculator = new Calculation();

        //Act
        int actualResult = calculator.calculate(x,y);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
