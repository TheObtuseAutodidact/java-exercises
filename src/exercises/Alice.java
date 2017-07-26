package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String word;
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner in = new Scanner(System.in);
        System.out.println("Here's your chance to search the text contained within the first sentence of" +
                " Alice's Advenures in Wonderland!");
        do {
            System.out.print("Enter a word( or type 'exit'): ");
            word = in.next();
            if (word.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                System.exit(0);
            }
            else if (sentence.toLowerCase().contains(word.toLowerCase())) {
                System.out.printf("Yes, '%s' is in the first sentence of Alice.\n", word);
            }
            else {
                System.out.printf("No, '%s' is not found in the first sentence of Alice.\n", word);
            }
        } while (!word.equalsIgnoreCase("exit"));



    }
}
