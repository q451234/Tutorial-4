package tut;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Testcalc 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Testcalc( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Testcalc.class );
    }

    /**
     * Rigourous Test :-)
     */


    public void test() {
	int result = Calc.add(1, 2);
	assertEquals(3, result);
		
	}

    public void test2() {
	int result = Calc.subtract(2,1);
    assertEquals(3, result);
		
	}

}
