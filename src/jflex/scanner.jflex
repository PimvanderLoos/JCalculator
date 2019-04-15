package jflex;

import cup.sym;
import java_cup.runtime.*;
%%
%class scanner
%unicode
%cup
%line
%column 
%public

%{
private Symbol symbol(int type) {
return new Symbol(type, yyline, yycolumn);
}
private Symbol symbol(int type, Object value) {
return new Symbol(type, yyline, yycolumn, value);
}
%}

WhiteSpace = [ \t\f\r\n]
Number = [0-9]+

%%
"," { return symbol(sym.COMMA); }
";" { return symbol(sym.SEMI); }
"+" { return symbol(sym.PLUS); }
"-" { return symbol(sym.MINUS); }
"*" { return symbol(sym.TIMES); }
"/" { return symbol(sym.DIVIDE); }
"(" { return symbol(sym.LPAREN); }
")" { return symbol(sym.RPAREN); }
"min" { return symbol(sym.MIN); }
"max" { return symbol(sym.MAX); }
"sqrt" { return symbol(sym.SQRT); }
"exp" { return symbol(sym.EXP); }
{Number} { return symbol(sym.NUMBER, new Integer(yytext())); }
{WhiteSpace} { /* ignore */ }
. { return symbol(sym.error, yytext()); }