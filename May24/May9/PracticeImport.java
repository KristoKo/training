package May9;

//import java.util.Random;
//java.lang.*;  are imported automatically
//java.lang.System; also automatically
import java.util.Date;
import java.sql.*;
import java.util.Random;

public class PracticeImport {
    private static Random rnd = new Random();

    public static int rollDice() {
        //Random rnd = new Random();
        return rnd.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            int number = rollDice();
            System.out.println(number);
        }






        //we can also not import Random and use a package like this:
//        java.util.Random rnd = new java.util.Random();
//      Random rnd = new Random();
//        System.out.println(rnd.nextInt(6));
//        System.out.println(rollDice());

    }
}
