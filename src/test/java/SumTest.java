import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Dmitry on 08.11.2016.
 */
public class SumTest {
    @Test//Positive
    //#1: 2+2=4
    //Expected result: 4
    //Actual result: 4
    public void testSumPositive(){
        AriphmeticOperations myTest = new AriphmeticOperations();
        int sum = myTest.sum(2,2);
        assertEquals(4,sum);
        System.out.println("Positive training has been passed '#1: 2+2=4'");
    }
    @Test//Negative
    //#1: 2+3=5
    //Expected result: 4
    //Actual result: 5
    public void testSumNegative(){
        AriphmeticOperations myTest = new AriphmeticOperations();

        Assert.assertTrue(4!=myTest.sum(3,2));
        System.out.println("Negative training has been passed '#1: 2+3=5'");
    }
    @Test
    //#2: 2+0=2
    //Expected result: 0
    //Actual result: 2
    public void testSumNegative2() {
        AriphmeticOperations myTest = new AriphmeticOperations();

        Assert.assertTrue(0 != myTest.sum(3, 2));
        System.out.println("Negative training has been passed '#2: 2+0=2'");
    }
}
