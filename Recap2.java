//Type some text, matching words in the array list will be capitalized.
//hi
package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Recap2 {

    private static boolean isInArray(String[] array, String el) {
        for (String element : array) {
            if (element.equals(el)) {
                return true;
            }
        }
        return false;
    }

    private static String[] upCaseWords(String text, String[] words) {

        String[] textWords = text.split(" ");
        int position = 0;
        for (String el: textWords) {

            if (isInArray(words, el)) {
                textWords[position] = textWords[position].toUpperCase();
            }
            position++;

        }
        return textWords;


       // return text;
    }

    public static void main(String[] args) {
        // read text from user and print it out in uppercase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type some text");

        String userInput = scanner.nextLine();

        String[] words = {"bla", "banana"};
        String[] upCase = upCaseWords(userInput, words);

        System.out.println(Arrays.toString(upCase));
    }
}
