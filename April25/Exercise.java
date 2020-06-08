package April25;

public class Exercise {

    public static void test(int number) {

        if (number % 15 == 0) {
            System.out.println("fizzbuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("buzz");
        }
        else if (number % 3 == 0){
            System.out.println("fizz");
        }
    }

    public static void main(String[] args) {
        test(2);
    }
}
