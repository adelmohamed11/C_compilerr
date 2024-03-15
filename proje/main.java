package proje;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
Scanner inputt=new Scanner (System.in);
String in=inputt.nextLine ();
Lexer  lex = new Lexer(in);
lex.tokenize();
for ( Token t : lex.tokens){
    System.out.println(t);
}
inputt.close();

    }
}
