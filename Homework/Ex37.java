//Write a Java program to reverse a string.

package Homework;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a string: ");

        char[] text = input.nextLine().toCharArray();

        for (int i = text.length -1; i >= 0  ; i-- ) {

            System.out.print(text[i]);

        }

    }

}
