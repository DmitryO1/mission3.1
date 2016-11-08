import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitry on 08.11.2016.
 */
public class DivideTest {
    @Test//Positive
    //#1: 6\3=2
    //Expected result: 2
    //Actual result: 2
    public void testSegmentationPositive(){
        Calculator divide = new Calculator();
        int result = divide.divide(6,3);
        Assert.assertTrue(2==result);
        System.out.println("Positive training has been passed '#1: 6/3=2");
    }

    @Test(expected=ArithmeticException.class)//Negative
    //#1: 6\0=0
    //Expected result: no result
    //Actual result: 0
    public void testSegmentationNegative(){
        Calculator divide = new Calculator();
        int result = divide.divide(6,0);
    }

}
