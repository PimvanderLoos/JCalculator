package nl.pim16aap2.jcalculator;

import java.io.FileReader;
import java.io.StringReader;
import java.util.Vector;

import cup.parser;

public class JCalculator
{
    public static void main(String[] args)
    {
        try
        {
            String fileName;
            if(args.length == 1)
                fileName = args[0];
            else
                fileName = "input.txt";

            System.out.println("Results:");
            int idx = 0;
            for (double d : getResults(new FileReader(fileName)))
                System.out.println(idx+++": " + d);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static Vector<Double> getResults(java.io.Reader in) throws Exception
    {
        parser p = new parser(new main.jflex.scanner(in));
        p.parse();
        return p.getResults();
    }

    public static double getResult(String str) throws Exception
    {
        return getResults(new StringReader(str + ";")).get(0);
    }

    public static Vector<Double> getResults_debug(java.io.Reader in) throws Exception
    {
        parser p = new parser(new main.jflex.scanner(in));
        p.debug_parse();
        return p.getResults();
    }

    public static double getResult_debug(String str) throws Exception
    {
        return getResults_debug(new StringReader(str + ";")).get(0);
    }
}
