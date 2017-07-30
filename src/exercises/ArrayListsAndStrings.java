package exercises;

import java.util.ArrayList;

public class ArrayListsAndStrings {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("nope");
        wordList.add("goods");
        wordList.add("bads");
        wordList.add("great");
        wordList.add("terrible");
        wordList.add("yasss");

        System.out.printf("wordList = %s\n", wordList);

        fiveLetterWords(wordList);
    }

    public static void fiveLetterWords(ArrayList<String> wordList) {
        for (String word : wordList) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}