package nl.pim16aap2.jcalculator;

import java.io.FileReader;
import java.io.StringReader;
import java.util.Vector;

import nl.pim16aap2.jcalculator.cup.parser;

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

    public static Vector<Double> getResults(java.io.Reader in) throws Exception
    {
        parser p = new parser(new nl.pim16aap2.jcalculator.jflex.scanner(in));
        p.parse();
        return p.getResults();
    }

    public static double getResult(String str) throws Exception
    {
        return getResults(new StringReader(str + ";")).get(0);
    }

    public static Vector<Double> getResults_debug(java.io.Reader in) throws Exception
    {
        parser p = new parser(new nl.pim16aap2.jcalculator.jflex.scanner(in));
        p.debug_parse();
        return p.getResults();
    }

    public static double getResult_debug(String str) throws Exception
    {
        return getResults_debug(new StringReader(str + ";")).get(0);
    }
}
