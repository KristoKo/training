package Homework;

import java.util.Scanner;

public class Ex37b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a String: ");
        String chars = scanner.nextLine();

        for (int i = chars.length() -1; i >= 0 ; i--) {
            System.out.print(chars.charAt(i));
        }

    }
}