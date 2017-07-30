package exercises;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);
        myList.add(11);
        System.out.printf("mylist = %s\n\n", myList);

        System.out.printf("The sum of all even numbers in this ArrayList is %d\n", sumEvens(myList));
    }

public static int sumEvens(ArrayList<Integer> nums) {
    int sum = 0;
    for (int num : nums) {
        if (num % 2 == 0) {
            sum += num;
        }
    }
    return sum;

    }
}