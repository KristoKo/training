package Homework;

public class Exercises3 {
    public static void main(String[] args) {
        int a = 12, b = 9;
        swapIt(a, b);

    }

    private static void swapIt(int a, int b) {
        //a=12
        //b=9
        a = a + b;
        //a=21
        //b=9
        b = a - b;
        //a=21
        //b=12
        a = a - b;



        /*    int temp = a;
        a = b;
        b = temp;
*/
        System.out.println("a = " + a + " b = " + b);

    }



}


