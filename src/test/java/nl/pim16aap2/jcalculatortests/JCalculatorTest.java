package nl.pim16aap2.jcalculatortests;

import nl.pim16aap2.jcalculator.JCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests to make sure everything works as expected.
 *
 * @author Pim
 */
class JCalculatorTest
{
    /**
     * Small value used for comparison of approximations.
     */
    private static final double EPS = 0.000001;

    /**
     * Test expression evaluation.
     *
     * @param expression     The expression to evaluate.
     * @param expectedResult The expected result of the evaluation.
     * @see JCalculator#getResult(String, String[], double[])
     */
    void test(String expression, double expectedResult)
    {
        try
        {
            final double result = JCalculator.getResult(expression);
            Assertions.assertEquals(expectedResult, result, expression);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Failed to parse expression: " + expression, e);
        }
    }

    /**
     * Test expression approximated results of evaluation (e.g. sin).
     *
     * @param expression     The expression to evaluate.
     * @param expectedResult The expected result of the evaluation.
     * @see JCalculator#getResult(String, String[], double[])
     */
    void testApproximate(String expression, double expectedResult)
    {
        try
        {
            final double result = JCalculator.getResult(expression);
            Assertions.assertEquals(expectedResult, result, EPS, expression);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Failed to parse expression: " + expression, e);
        }
    }

    /**
     * Test variable substitution and expression evaluation.
     *
     * @param expression     The expression to evaluate.
     * @param expectedResult The expected result of the evaluation.
     * @param variables      The names of the variables to be substituted.
     * @param values         The values of the variables.
     * @see JCalculator#getResult(String, String[], double[])
     */
    void test(String expression, double expectedResult, final String[] variables, final double[] values)
    {
        try
        {
            final double result = JCalculator.getResult(expression, variables, values);
            Assertions.assertEquals(expectedResult, result, expression);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Failed to parse expression: " + expression, e);
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
        test("2^5*2^5", 1024);
        test("-2^10", -1024);
        test("ln(1)", 0);
        test("log(10)", 1);
        testApproximate("sin(pi)", 0);
        testApproximate("sin(0.5 * pi)", 1);
        testApproximate("sin(0.5 * pi)", 1);
        testApproximate("asin(1)", 1.57079633);
        testApproximate("cos(pi)", -1);
        testApproximate("acos(1)", 0);
        testApproximate("tan(0)", 0);
        testApproximate("tan(1)", 1.55740772465);
        testApproximate("atan(1)", 0.785398163);
        testApproximate("atan2(1, 2)", 0.463647609001);
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
        test("xx*x*xxx", 4, new String[]{"xxx", "x", "xx"}, new double[]{1, 2, 2});

        Assertions.assertThrows(IllegalStateException.class,
                                () -> JCalculator.getResult("xx", new String[]{"x"}, new double[]{1}));

        Assertions.assertThrows(IllegalArgumentException.class,
                                () -> JCalculator.getResult("xx", new String[]{"xx"}, new double[]{1, 2}));

        Assertions.assertThrows(IllegalArgumentException.class,
                                () -> JCalculator.getResult("xx", new String[]{"xx"}, new double[0]));

        Assertions.assertThrows(IllegalStateException.class,
                                () -> JCalculator.getResult("xx", new String[]{"xx"}, null));

        Assertions.assertThrows(IllegalStateException.class,
                                () -> JCalculator.getResult("xx", null, new double[]{1}));
    }

    @Test
    void testOrdering()
    {
        test("128 / 2 + 128 / 2", 128);
        test("128 / 4 + 128 / 4 + 32 * 2", 128);
        test("2 ^ 6 - 16 * 2 + 8 * 4", 64);
    }
}
