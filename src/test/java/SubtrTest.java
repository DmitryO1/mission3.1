import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dmitry on 08.11.2016.
 */
public class SubtrTest {
    @Test//Positive
    //#1: 5-3=2
    //Expected result: 2
    //Actual result: 2
    public void testSubtrPositive(){
        AriphmeticOperations subtraction = new AriphmeticOperations();
        int result = subtraction.subtr(5,3);
        Assert.assertTrue(2==result);
        System.out.println("Positive training has been passed '#1: 5-3=2");
    }
    @Test//Negative
    //#1: 0-5=-5
    //Expected result: 0
    //Actual result: -5
    public void testSubtrNegative1(){
        AriphmeticOperations subtraction = new AriphmeticOperations();
        int result = subtraction.subtr(0,-5);
        Assert.assertTrue(0!=result);
        System.out.println("Negative training has been passed '#1: 0-5=0");
    }

}
