package exercises;

import java.util.Scanner;

public class HelloYou {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.printf("Hello, %s!\n", name);
    }
}
