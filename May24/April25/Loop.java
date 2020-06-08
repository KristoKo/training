package April25;

import java.util.Scanner;

public class Loop {



    public static String getDogName() {                   //method
        Scanner scanner = new Scanner(System.in);
        String dogName = scanner.nextLine();
        return dogName;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        //String STOP_MSG = "NO DOG";

        while (number < 3) {

            number++;     // add +1 to number count to avoid endless loop

            if (number == 3) {
                return;   // break;    -can be used to break the loop as well
            }

            System.out.println(number + " aaa");
            String dogName = getDogName();

            //if (dogName.equals("STOP_MSG")) {
            //    break;
            //}

            System.out.println("Your dog name is " + dogName);
        }



    }

}
