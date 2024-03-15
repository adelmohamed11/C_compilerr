package proje;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your multiline input (type 'exe' on a separate line to finish):");

        StringBuilder input = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equals("exe")) {
            input.append(line).append("\n"); // Append newline character for each line
        }
        // Remove the last newline character
        input.deleteCharAt(input.length() - 1);

        Lexer lexer = new Lexer(input.toString());
        lexer.tokenize();
        for (Token token : lexer.tokens) {
            System.out.println(token);
        }

        scanner.close();
    }
}
