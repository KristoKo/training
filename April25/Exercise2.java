package April25;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        //user can input numbers and operators (+, - only) 1 by 1
        //when = instead of operator
        //then you print the result

        Scanner scanner = new Scanner(System.in);
        
        String operator = "";

        int temp = 0;
        while (!operator.equals("=")) {

            System.out.println("Please input numbers");
            int number = scanner.nextInt();
            number = number;

            System.out.println("Please input operator (+,-,=..)");
            operator = scanner.next();


            if (operator.equals("+")) {
                temp = number + temp;
            } else if (operator.equals("-")) {
                temp = number - temp;
            }

            System.out.println(temp);
        }

            //else if (operator.equals("=")) {         // we need another if check for ==
            //    temp = number + temp;
            //}


    }


}
