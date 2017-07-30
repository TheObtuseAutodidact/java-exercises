package exercises;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] myArray = new int[]{1,1,2,3,5,8};

        System.out.printf("myArray = %s\n", Arrays.toString(myArray));

        for (int num : myArray) {
            System.out.println(num);
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("myArray[%d] => %d\n", i, myArray[i]);
        }
    }
}
