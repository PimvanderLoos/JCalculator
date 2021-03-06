package nl.pim16aap2.jcalculator;

import nl.pim16aap2.jcalculator.sym;
import java_cup.runtime.*;
%%
%class scanner
%unicode
%cup
%line
%column 
%apiprivate

%{
private Symbol symbol(int type) {
return new Symbol(type, yyline, yycolumn);
}
private Symbol symbol(int type, Object value) {
return new Symbol(type, yyline, yycolumn, value);
}
%}

WhiteSpace = [ \t\f\r\n]
Number = [0-9]+ ("." [0-9]+)?
Word = [a-zA-Z]+

%%
"," { return symbol(sym.COMMA); }
";" { return symbol(sym.SEMI); }
"+" { return symbol(sym.PLUS); }
"-" { return symbol(sym.MINUS); }
"*" { return symbol(sym.TIMES); }
"/" { return symbol(sym.DIVIDE); }
"(" { return symbol(sym.LPAREN); }
")" { return symbol(sym.RPAREN); }
"%" { return symbol(sym.MOD); }
"^" { return symbol(sym.EXP); }
"min" { return symbol(sym.MIN); }
"max" { return symbol(sym.MAX); }
"abs" { return symbol(sym.ABS); }
"sqrt" { return symbol(sym.SQRT); }
"sin" { return symbol(sym.SIN); }
"asin" { return symbol(sym.ASIN); }
"cos" { return symbol(sym.COS); }
"acos" { return symbol(sym.ACOS); }
"tan" { return symbol(sym.TAN); }
"atan" { return symbol(sym.ATAN); }
"atan2" { return symbol(sym.ATAN2); }
"log" { return symbol(sym.LOG); }
"ln" { return symbol(sym.LN); }
"pi" { return symbol(sym.PI); }
"e" { return symbol(sym.E); }
{Number} { return symbol(sym.NUMBER, Double.parseDouble(yytext())); }
{Word} { return symbol(sym.WORD, yytext()); }
{WhiteSpace} { /* ignore */ }
. { return symbol(sym.error, yytext()); }
