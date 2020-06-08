package Homework;

public class Exercises1 {
    //fib
    // 0 1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args) {
        fib(10);

    }

    static void fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;


        for (int i=1; i<=n; i++) {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }

}




