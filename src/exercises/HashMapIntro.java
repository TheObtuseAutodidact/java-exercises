package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

    public static void main(String[] args) {
        HashMap<Integer, String> studentDirectory = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String studentID;
        int studentIdNum;

        do {
            System.out.print("Enter new Student ID number (or 'Enter' to quit): ");
            studentID = in.nextLine();

            if (!studentID.equals("")) {
                studentIdNum = Integer.parseInt(studentID);
                System.out.printf("Enter name for student %d: ", studentIdNum);
                String studentName = in.nextLine();
                studentDirectory.put(studentIdNum, studentName);
            }
        } while(!studentID.equals(""));

        System.out.println("\n_____________________________\n");
        for (Map.Entry<Integer, String> student : studentDirectory.entrySet()) {
            System.out.printf("Student ID: %d, Student Name: %s\n", student.getKey(), student.getValue());
        }

    }
}
