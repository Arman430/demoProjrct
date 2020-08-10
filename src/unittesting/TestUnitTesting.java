package unittesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUnitTesting {
    @Before
    public void Hello(){
        System.out.println("Say hello");
    }

    @After
    public void What(){
        System.out.println("Say What!!!!");
    }

    @Test
    public void testDoSummation(){
        Calculator.doSummation();
        int expectedResult = 50;
        int actualResult = Calculator.doSummation();
        Assert.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testDoSubtraction(){
        //Calculator.doSubtraction(30,40);
        int epResult =11;
        int acResult= Calculator.doSubtraction(30,40);
        Assert.assertEquals(epResult,acResult);
        Assert.assertEquals("Test fall",epResult,acResult );


    }

    @Test
    public void testDoMultiply(){
        Calculator.doMultiply();
        //Expected and Reality
        int epResult =600;
        int acResult= Calculator.doMultiply();

       Assert.assertEquals(epResult,acResult);
        //Assert.assertNotEquals(epResult,acResult);

    }
    @Test
    public void testDoSubtraction1(){
        //Calculator.doSubtraction(30,40);
        int epResult =10;
        int acResult= Calculator.doSubtraction(30,40);
        Assert.assertEquals(epResult,acResult);
        //Assert.assertEquals("Test fall",epResult,acResult );


    }


}
