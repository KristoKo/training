package Homework;

public class Exercises {

    public static void main(String[] args) {

    printPattern(5);

    }

    //write a method
    static void printPattern(int n) {
        //variable i we want to go through 5 lines

        for (int i=0; i<n; i++) {
            for (int j=n-i; j>1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 2*i; j++) {
                System.out.print(i+1);
            }

            System.out.println();
        }
    }

}
