import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitry on 08.11.2016.
 */
public class MultiplyTest {
    @Test//Positive
    //#1: 5*5=25
    //Expected result: 25
    //Actual result: 25
    public void testSubtrPositive() {
        Calculator multiply = new Calculator();
        int result = multiply.multiply(5, 5);
        Assert.assertTrue(25 == result);
        System.out.println("Positive training has been passed '#1: 5*5=25");
    }

    @Test//Positive
    //#2: 5*0=25
    //Expected result: 0
    //Actual result: 0
    public void testSubtrPositive1() {
        Calculator multiply = new Calculator();
        int result = multiply.multiply(5, 0);
        Assert.assertTrue(0 == result);
        System.out.println("Positive training has been passed '#2: 5*0=0");
    }

    @Test//Negative
    //#2: 5*5=30
    //Expected result: 25
    //Actual result: 30
    public void testSubtrNegative() {
        Calculator multiply = new Calculator();
        int result = multiply.multiply(5, 5);
        Assert.assertTrue(30 != result);
        System.out.println("Negative training has been passed '#1: 5*5=30");
    }
}
