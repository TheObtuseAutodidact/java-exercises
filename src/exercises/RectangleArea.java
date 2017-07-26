package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rectangle length: ");
        double length = in.nextDouble();
        System.out.print("Enter the rectangle width: ");
        double width = in.nextDouble();
        double area = length * width;
        System.out.printf("A rectangle of length, %s and width, %s will have and area of %s",
                length, width, area);


    }
}
