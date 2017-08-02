package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class CountingCharacters {

    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue." +
            " Praesent quis rhoncus justo. " +
            "Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa." +
            " Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. " +
            "Donec nec velit non ligula efficitur luctus.";

    public static void main(String[] args) {


        Count();
        System.out.println("\n____________________________\n");
        Count("This is a test.");
    }

    public static void Count() {
        HashMap<String, Integer> charCount = new HashMap<>();

        for(int i = 0; i < TEXT.length(); i++) {
            char preLetter = TEXT.charAt(i);

            if (Character.isLetter(preLetter)) {

                String letter = String.valueOf(preLetter).toLowerCase();
                if (!charCount.containsKey(letter)) {
                    charCount.put(letter, 1);
                } else {
                    charCount.put(letter, charCount.get(letter) + 1);
                }
            }
        }
        for(Map.Entry<String, Integer> myMap : charCount.entrySet()) {
            System.out.println(myMap.getKey()+ ":" + myMap.getValue());
        }
    }


    public static void Count(String text) {
        HashMap<String, Integer> charCount = new HashMap<>();

        for(int i = 0; i < text.length(); i++) {
            char preLetter = text.charAt(i);

            if (Character.isLetter(preLetter)) {

                String letter = String.valueOf(preLetter).toLowerCase();
                if (!charCount.containsKey(letter)) {
                    charCount.put(letter, 1);
                } else {
                    charCount.put(letter, charCount.get(letter) + 1);
                }
            }
        }
        for(Map.Entry<String, Integer> myMap : charCount.entrySet()) {
            System.out.println(myMap.getKey()+ ":" + myMap.getValue());
        }
    }
}
