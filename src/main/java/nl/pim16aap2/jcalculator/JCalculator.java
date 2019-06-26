package nl.pim16aap2.jcalculator;

import java.io.FileReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Vector;

import nl.pim16aap2.jcalculator.cup.parser;

/**
 * Class that can parse expressions from Strings.
 *
 * @author Pim
 */
public class JCalculator
{
    /**
     * Allows this project to be used using CLI. Can process files or Strings.
     *
     * @param args
     */
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
                for (double d : getResults(new FileReader(fileName)))
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
     *
     * @param in Expression(s) to evaluate. Every expression MUST end with a semicolon!
     * @return The result(s) of the expression(s).
     * @throws Exception
     */
    private static Vector<Double> getResults(java.io.Reader in) throws Exception
    {
        parser p = new parser(new nl.pim16aap2.jcalculator.jflex.scanner(in));
        p.parse();
        return p.getResults();
    }

    /**
     * Evaluate a single expression. Must not end with a semicolon!
     *
     * @param expression The expression to evaluate.
     * @return The result of the expression.
     * @throws Exception
     */
    public static double getResult(String expression) throws Exception
    {
        return getResults(new StringReader(expression + ";")).get(0);
    }

    /**
     * Evaluate a single expression and substitute variables with given values.
     *
     * @param expression Expression containing variables.
     * @param variables  The names of the variables to be substituted.
     * @param values     The values of the variables.
     * @return The expression with variables substituted with values.
     * @throws IllegalArgumentException
     */
    private static String substituteVariables(String expression, final String[] variables, final double[] values)
            throws IllegalArgumentException
    {
        if (variables.length != values.length)
            throw new IllegalArgumentException(
                    "variable count (" + variables.length + ") and value count (" + values.length + ") did not match!");
        for (int idx = 0; idx != variables.length; ++idx)
            expression = expression.replaceAll(variables[idx], Double.toString(values[idx]));
        return expression;
    }

    /**
     * Evaluate a single expression and substitute variables with given values.
     *
     * @param expression The expression to evaluate.
     * @param variables  The names of the variables to be substituted.
     * @param values     The values of the variabes.
     * @return The result of the expression.
     * @throws Exception
     * @see JCalculator#getResult(String)
     */
    public static double getResult(String expression, final String[] variables, final double[] values) throws Exception
    {
        return getResult(substituteVariables(expression, variables, values));
    }

    /**
     * Print debug results of {@link JCalculator#getResults(Reader)}.
     */
    private static Vector<Double> getResults_debug(java.io.Reader in) throws Exception
    {
        parser p = new parser(new nl.pim16aap2.jcalculator.jflex.scanner(in));
        p.debug_parse();
        return p.getResults();
    }

    /**
     * Print debug results of {@link JCalculator#getResult(String)}.
     */
    public static double getResult_debug(String expression) throws Exception
    {
        return getResults_debug(new StringReader(expression + ";")).get(0);
    }

    /**
     * Print debug results of {@link JCalculator#getResult(String, String[], double[])}.
     */
    public static double getResult_debug(String expression, final String[] variables, final double[] values)
            throws Exception
    {
        return getResults(new StringReader(substituteVariables(expression, variables, values))).get(0);
    }
}
