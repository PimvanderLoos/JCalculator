package nl.pim16aap2.jcalculatortests;

import nl.pim16aap2.jcalculator.JCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit tests to make sure everything works as expected.
 *
 * @author Pim
 */
class JCalculatorTest
{

    /**
     * Test expression evaluation.
     *
     * @param expression     The expression to evaluate.
     * @param expectedResult The expected result of the evaluation.
     * @see JCalculator#getResult(String, String[], double[])
     */
    void test(String expression, double expectedResult)
    {
        Double result = null;
        try
        {
            result = JCalculator.getResult(expression);
            assert (result == expectedResult);
        }
        catch (AssertionError e)
        {
            fail("Expression: \"" + expression + "\". Expected result: " + expectedResult + ", obtained result: " + result);
            throw e;
        }
        catch (Exception e)
        {
            fail(expression);
        }
    }

    /**
     * Test variable substitution and expression evaluation.
     *
     * @param expression     The expression to evaluate.
     * @param expectedResult The expected result of the evaluation.
     * @param variables      The names of the variables to be substituted.
     * @param values         The values of the variabes.
     * @see JCalculator#getResult(String, String[], double[])
     */
    void test(String expression, double expectedResult, final String[] variables, final double[] values)
    {
        Double result = null;
        try
        {
            result = JCalculator.getResult(expression, variables, values);
            assert (result == expectedResult);
        }
        catch (AssertionError e)
        {
            fail("Expression: \"" + expression + "\". Expected result: " + expectedResult + ", obtained result: " + result);
            throw e;
        }
        catch (Exception e)
        {
            fail(expression);
        }
    }

    /**
     * Test basic operations.
     */
    @Test
    void testBasic()
    {
        test("1+1", 2);
        test("2*2", 4);
        test("2-1", 1);
        test("4/2", 2);
        test("9%5", 4);
        test("2^10", 1024);
        test("min(-1, 0)", -1);
        test("max(0, 10)", 10);
        test("abs(-10)", 10);
        test("sqrt(144)", 12);
        test("max(10, sqrt(16)^4/100*4)", 10.24);
    }

    /**
     * Test operations using variable substitution.
     */
    @Test
    void testSubstitution()
    {
        test("2*x", 4, new String[]{"x"}, new double[]{2});
        test("max(10, sqrt(16)^4/100*blockCount)", 10.24,
                new String[]{"blockCount"}, new double[]{4});
        test("x*x*x", 8, new String[]{"x"}, new double[]{2});
    }

}
