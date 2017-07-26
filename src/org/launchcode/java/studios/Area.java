package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.println("setup");
        Scanner in;
        Double pi = 3.14159;
        Double radius;

        in = new Scanner(System.in);
        System.out.printf("Enter radius: ");
        do {
            radius = in.nextDouble();

            if (radius < 0) {
                System.out.print("Aw man, you know you can't have a negative radius. Try again: ");
            }
        } while(radius < 0);
        Double area = (pi * radius * radius);
        System.out.printf("The area of a circle of radius %s, is: %s\n", radius, area);
    }
}
