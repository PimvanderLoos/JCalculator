package nl.pim16aap2.jcalculator;

import java.io.FileReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;


/**
 * Class that can parse expressions from Strings.
 *
 * @author Pim
 */
public class JCalculator
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Please provide a String that contains an expression (e.g. \"1+1\") " +
                                   "or a file containing one or more expressions (separated by ';'). For example -f expr.txt");
            return;
        }
        if (args[0].equalsIgnoreCase("-f"))
        {
            if (args.length == 1)
            {
                System.out.println("Please provide a file!");
                return;
            }
            try
            {
                String fileName = args[1];
                System.out.println("Results:");
                int idx = 0;
                for (Double d : getResults(new FileReader(fileName), null, null, false))
                    System.out.println(idx++ + ": " + d);
                return;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        try
        {
            for (String arg : args)
                System.out.println(arg + " = " + getResult(arg));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Evaluate all the semicolon-separated expressions.
     * <p>
     * When a set of variables/values is supplied, these must be of the same length and their indices are expected to
     * correspond to each other.
     * <p>
     * When no variables/values are required, they can be left null.
     *
     * @param in        Expression(s) to evaluate. Every expression MUST end with a semicolon!
     * @param variables The names of the variables to be substituted.
     * @param values    The values of the variables.
     * @param debug     Whether to enable debugging.
     * @return The result(s) of the expression(s).
     *
     * @throws Exception
     */
    private static List<Double> getResults(java.io.Reader in, final String[] variables, final double[] values,
                                           final boolean debug)
        throws Exception
    {
        // Ignore the "Cannot resolve symbol/method" errors here.
        // The classes (and their methods) will be generated during compilation.
        parser p = new parser(new nl.pim16aap2.jcalculator.scanner(in));
        if (variables != null && values != null)
            p.setVariables(new Variables(Arrays.asList(variables), values));

        if (debug)
            p.debug_parse();
        else
            p.parse();
        return p.getResults();
    }

    /**
     * Evaluate a single expression. Must not end with a semicolon!
     *
     * @param expression The expression to evaluate.
     * @return The result of the expression.
     *
     * @throws Exception
     */
    public static double getResult(String expression)
        throws Exception
    {
        return getResult(expression, null, null);
    }

    /**
     * Evaluate a single expression and substitute variables with given values.
     * <p>
     * When a set of variables/values is supplied, these must be of the same length and their indices are expected to
     * correspond to each other.
     *
     * @param expression The expression to evaluate.
     * @param variables  The names of the variables to be substituted.
     * @param values     The values of the variables.
     * @return The result of the expression.
     *
     * @throws Exception
     * @see JCalculator#getResult(String)
     */
    public static double getResult(String expression, final String[] variables, final double[] values)
        throws Exception
    {
        return getResults(new StringReader(expression + ";"), variables, values, false).get(0);
    }

    /**
     * Print debug results of {@link JCalculator#getResult_debug(String, String[], double[])}.
     */
    public static double getResult_debug(String expression)
        throws Exception
    {
        return getResult_debug(expression, null, null);
    }

    /**
     * Print debug results of {@link JCalculator#getResult(String, String[], double[])}.
     */
    public static double getResult_debug(String expression, final String[] variables, final double[] values)
        throws Exception
    {
        return getResults(new StringReader(expression + ";"), variables, values, true).get(0);
    }
}
