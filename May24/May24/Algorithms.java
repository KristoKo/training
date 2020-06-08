package May24;

import java.util.Scanner;

public class Algorithms {
    public static void main(String[] args) {

        int nr1=0;
        int nr2=0;
        int sum=0;



    //input 2 numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        nr1 = scanner.nextInt();
        nr2 = scanner.nextInt();
    //add the numbers
        sum = nr1 + nr2;

    //output the sum
        System.out.println("They add up and result is: " + sum);



    }
}
