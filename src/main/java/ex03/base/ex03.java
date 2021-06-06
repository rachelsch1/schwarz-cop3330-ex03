package ex03.base;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String author = input.nextLine();

        String outputString = author + " says, \"" + quote + "\"";

        System.out.println(outputString);
    }
}
