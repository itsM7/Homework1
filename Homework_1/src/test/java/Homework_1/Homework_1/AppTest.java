package Homework_1.Homework_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    ComparingNumbers test = new ComparingNumbers();
    
    // ---------------- regular test ----------------
    @Test
    // positive
    public void Test_1()
    {
    	String Expected_Result = "A";
    	int a = 19, b = 13;
    	String mod = "regular";
    	String resut = test.Comparing(a, b, mod);
    	assertEquals(Expected_Result, resut);
    }
    @Test
    // positive
    public void Test_2()
    {
    	String Expected_Result = "B";
    	int a = -1, b = 100;
    	String mod = "regular";
    	String resut = test.Comparing(a, b, mod);
    	assertEquals(Expected_Result, resut);
    }
    @Test
    // negative
    public void Test_3()
    {
    	String Expected_Result = "Error";
    	int a = -99, b = -99;
    	String mod = "regular";
    	String resut = test.Comparing(a, b, mod);
    	assertEquals(Expected_Result, resut);
    }
    
    // ---------------- negatives test ----------------
    @Test
    // positive
    public void Test_4()
    {
    	String Expected_Result = "B";
    	int a = 3, b = 2;
    	String mod = "negatives";
    	String resut = test.Comparing(a, b, mod);
    	assertEquals(Expected_Result, resut);
    }
    @Test
    // positive
    public void Test_5()
    {
    	String Expected_Result = "A";
    	int a = -1, b = 22;
    	String mod = "negatives";
    	String resut = test.Comparing(a, b, mod);
    	assertEquals(Expected_Result, resut);
    }
    @Test
    // negative
    public void Test_6()
    {
    	String Expected_Result = "Error";
    	int a = -2, b = -2;
    	String mod = "negatives";
    	String resut = test.Comparing(a, b, mod);
    	assertEquals(Expected_Result, resut);
    }
    
    // ---------------- reciprocals test ----------------
    @Test
    // positive
    public void Test_7()
    {
    	String Expected_Result = "B";
    	int a = 12, b = 3;
    	String mod = "reciprocals";
    	String resut = test.Comparing(a, b, mod);
    	assertEquals(Expected_Result, resut);
    }
    @Test
    // positive
    public void Test_8()
    {
    	String Expected_Result = "A";
    	int a = -6, b = -1;
    	String mod = "reciprocals";
    	String resut = test.Comparing(a, b, mod);
    	assertEquals(Expected_Result, resut);
    }
    @Test//(expected=java.lang.ArithmeticException.class)
    // negative
    public void Test_9() //throws DivisionByZeroException
    {
    	String Expected_Result = "Cannot divide by zero";
    	int a = 0, b = -9;
    	String mod = "reciprocals";
    	String resut = test.Comparing(a, b, mod);
    	assertEquals(Expected_Result, resut);
    }
}