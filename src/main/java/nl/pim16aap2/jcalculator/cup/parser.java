
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Jun 25 16:36:44 CEST 2019
//----------------------------------------------------

package nl.pim16aap2.jcalculator.cup;

import java_cup.runtime.*;
import java.util.Vector;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Jun 25 16:36:44 CEST 2019
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\005\002\000\002\003\005\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\005\000\002\004\005\000\002\004\010\000\002" +
    "\004\010\000\002\004\006\000\002\004\006\000\002\004" +
    "\003\000\002\004\003\000\002\004\004\000\002\004\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\022\006\004\011\016\012\005\013\012\015" +
    "\010\021\015\023\007\024\011\001\002\000\022\006\004" +
    "\011\016\012\005\013\012\015\010\021\015\023\007\024" +
    "\011\001\002\000\004\021\054\001\002\000\024\002\052" +
    "\006\004\011\016\012\005\013\012\015\010\021\015\023" +
    "\007\024\011\001\002\000\024\004\ufff2\005\ufff2\006\ufff2" +
    "\007\ufff2\010\ufff2\014\ufff2\016\ufff2\017\ufff2\022\ufff2\001" +
    "\002\000\004\021\047\001\002\000\024\004\ufff1\005\ufff1" +
    "\006\ufff1\007\ufff1\010\ufff1\014\ufff1\016\ufff1\017\ufff1\022" +
    "\ufff1\001\002\000\004\021\044\001\002\000\020\004\ufffe" +
    "\005\023\006\024\007\027\010\026\014\025\017\022\001" +
    "\002\000\024\002\uffff\006\uffff\011\uffff\012\uffff\013\uffff" +
    "\015\uffff\021\uffff\023\uffff\024\uffff\001\002\000\022\006" +
    "\004\011\016\012\005\013\012\015\010\021\015\023\007" +
    "\024\011\001\002\000\004\021\017\001\002\000\022\006" +
    "\004\011\016\012\005\013\012\015\010\021\015\023\007" +
    "\024\011\001\002\000\020\005\023\006\024\007\027\010" +
    "\026\014\025\016\021\017\022\001\002\000\022\006\004" +
    "\011\016\012\005\013\012\015\010\021\015\023\007\024" +
    "\011\001\002\000\022\006\004\011\016\012\005\013\012" +
    "\015\010\021\015\023\007\024\011\001\002\000\022\006" +
    "\004\011\016\012\005\013\012\015\010\021\015\023\007" +
    "\024\011\001\002\000\022\006\004\011\016\012\005\013" +
    "\012\015\010\021\015\023\007\024\011\001\002\000\022" +
    "\006\004\011\016\012\005\013\012\015\010\021\015\023" +
    "\007\024\011\001\002\000\022\006\004\011\016\012\005" +
    "\013\012\015\010\021\015\023\007\024\011\001\002\000" +
    "\022\006\004\011\016\012\005\013\012\015\010\021\015" +
    "\023\007\024\011\001\002\000\024\004\ufffa\005\ufffa\006" +
    "\ufffa\007\ufffa\010\ufffa\014\ufffa\016\ufffa\017\ufffa\022\ufffa" +
    "\001\002\000\024\004\ufff9\005\ufff9\006\ufff9\007\ufff9\010" +
    "\ufff9\014\ufff9\016\ufff9\017\ufff9\022\ufff9\001\002\000\024" +
    "\004\ufff8\005\ufff8\006\ufff8\007\ufff8\010\ufff8\014\ufff8\016" +
    "\ufff8\017\ufff8\022\ufff8\001\002\000\024\004\ufffb\005\ufffb" +
    "\006\ufffb\007\027\010\026\014\025\016\ufffb\017\022\022" +
    "\ufffb\001\002\000\024\004\ufffc\005\ufffc\006\ufffc\007\027" +
    "\010\026\014\025\016\ufffc\017\022\022\ufffc\001\002\000" +
    "\024\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\014\ufff7" +
    "\016\ufff7\017\ufff7\022\ufff7\001\002\000\020\005\023\006" +
    "\024\007\027\010\026\014\025\017\022\022\037\001\002" +
    "\000\024\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\014" +
    "\ufff6\016\ufff6\017\ufff6\022\ufff6\001\002\000\020\005\023" +
    "\006\024\007\027\010\026\014\025\017\022\022\041\001" +
    "\002\000\024\004\uffef\005\uffef\006\uffef\007\uffef\010\uffef" +
    "\014\uffef\016\uffef\017\uffef\022\uffef\001\002\000\004\004" +
    "\043\001\002\000\024\002\ufffd\006\ufffd\011\ufffd\012\ufffd" +
    "\013\ufffd\015\ufffd\021\ufffd\023\ufffd\024\ufffd\001\002\000" +
    "\022\006\004\011\016\012\005\013\012\015\010\021\015" +
    "\023\007\024\011\001\002\000\020\005\023\006\024\007" +
    "\027\010\026\014\025\017\022\022\046\001\002\000\024" +
    "\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3\014\ufff3\016" +
    "\ufff3\017\ufff3\022\ufff3\001\002\000\022\006\004\011\016" +
    "\012\005\013\012\015\010\021\015\023\007\024\011\001" +
    "\002\000\020\005\023\006\024\007\027\010\026\014\025" +
    "\017\022\022\051\001\002\000\024\004\ufff4\005\ufff4\006" +
    "\ufff4\007\ufff4\010\ufff4\014\ufff4\016\ufff4\017\ufff4\022\ufff4" +
    "\001\002\000\004\002\000\001\002\000\024\002\001\006" +
    "\001\011\001\012\001\013\001\015\001\021\001\023\001" +
    "\024\001\001\002\000\022\006\004\011\016\012\005\013" +
    "\012\015\010\021\015\023\007\024\011\001\002\000\020" +
    "\005\023\006\024\007\027\010\026\014\025\016\056\017" +
    "\022\001\002\000\022\006\004\011\016\012\005\013\012" +
    "\015\010\021\015\023\007\024\011\001\002\000\020\005" +
    "\023\006\024\007\027\010\026\014\025\017\022\022\060" +
    "\001\002\000\024\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010" +
    "\ufff5\014\ufff5\016\ufff5\017\ufff5\022\ufff5\001\002\000\024" +
    "\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0\014\ufff0\016" +
    "\ufff0\017\ufff0\022\ufff0\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\010\002\005\003\013\004\012\001\001\000" +
    "\004\004\060\001\001\000\002\001\001\000\006\003\052" +
    "\004\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\041\001\001" +
    "\000\002\001\001\000\004\004\037\001\001\000\002\001" +
    "\001\000\004\004\017\001\001\000\002\001\001\000\004" +
    "\004\035\001\001\000\004\004\034\001\001\000\004\004" +
    "\033\001\001\000\004\004\032\001\001\000\004\004\031" +
    "\001\001\000\004\004\030\001\001\000\004\004\027\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\044\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\047\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\054\001\001" +
    "\000\002\001\001\000\004\004\056\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Vector<Double> results = new Vector<>();

    public void addResult(double val)
    {
        results.add(val);
    }

    public Vector<Double> getResults()
    {
        return results;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= LPAREN expr RPAREN 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= MINUS expr 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Double(0 - e.doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= ID 
            {
              Double RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= NUMBER 
            {
              Double RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double n = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= SQRT LPAREN expr RPAREN 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Double(Math.sqrt(e)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= ABS LPAREN expr RPAREN 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Double(Math.abs(e)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= MAX LPAREN expr COMMA expr RPAREN 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Double(Math.max(e1, e2)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= MIN LPAREN expr COMMA expr RPAREN 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Double(Math.min(e1, e2)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= expr MOD expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Double(e1.doubleValue() % e2.doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr EXP expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Double(Math.pow(e1, e2)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr DIVIDE expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Double(e1.doubleValue() / e2.doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr TIMES expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Double(e1.doubleValue() * e2.doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr MINUS expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Double(e1.doubleValue() - e2.doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr PLUS expr 
            {
              Double RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Double(e1.doubleValue() + e2.doubleValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr_part ::= expr NT$0 SEMI 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$0 ::= 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 parser.addResult(e); RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_part 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr_part 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

