package nl.pim16aap2.jcalculatortests;

import nl.pim16aap2.jcalculator.JCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit tests to make sure all basic operators function properly.
 *
 * @author Pim
 */
class JCalculatorTest
{
    void test(String expression, double expectedResult)
    {
        Double result = null;
        try
        {
            result = JCalculator.getResult(expression);
            assert(result == expectedResult);
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

    @Test
    void test()
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

}
