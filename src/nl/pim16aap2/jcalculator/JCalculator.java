package nl.pim16aap2.jcalculator;

import java.io.FileReader;

import cup.parser;
import jflex.scanner;

class JCalculator
{
    public static void main(String[] args)
    {
        try
        {
            String fileName = "input.txt";

            parser p = new parser(new scanner(new FileReader(fileName)));
//            parser p = new parser(new scanner(new StringReader(formula)));
            p.parse();

            int idx = 0;
            for (double d : p.getResults())
                System.out.println(idx+++": " + d);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
