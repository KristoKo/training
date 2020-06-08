//32. Write a Java program to compare two numbers. Go to the editor
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//
//        25 != 39
//        25 < 39
//        25 <= 39



package Homework;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("First number: ");
        int number1 = input.nextInt();
        System.out.println("Second number: ");
        int number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        }   if (number1 != number2) {
            System.out.println(number1 + " != " + number2);
        }   if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        }   if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        }   if (number1 <= number2) {
            System.out.println(number1 + " <= " + number2);
        }   if (number1 >= number2) {
            System.out.println(number1 + " >= " + number2);
        }

    }
}
