package April25;

public class Bigger {

    public static int GetBigger(int a, int b) {
        if (a > b) {
            return a;
        }   else {
            return b;
        }
    }

    public static void main(String[] args) {

        int bigger = GetBigger(2,3);
        System.out.println(bigger);

        bigger = GetBigger(3, 2);
        System.out.println(bigger);

    }



}


