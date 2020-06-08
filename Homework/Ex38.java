//38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.

package Homework;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text to count letters from: ");
        String characters = scanner.nextLine();
        count(characters);


    }
    public static void count(String input) {
        char[] characters = input.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;


        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(characters[i])) {
                letter++;
            } else if (Character.isSpaceChar(characters[i])) {
                space++;
            } else if (Character.isDigit(characters[i])) {
                num++;
            } else {
                other++;
            }
        }

        System.out.println("You typed " + characters);
        System.out.println("letters: " + letter);
        System.out.println("spaces: " + space);
        System.out.println("numbers: " + num);
        System.out.println("others: " + other);
    }

}
