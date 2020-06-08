package May23;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        int milk = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to buy milk? ");
        String input = scanner.nextLine();
        if (input.equals("yes")) {
            System.out.println("That will be " + milk + " euros, please!");
            System.out.println("How much money will you give?");
            int money = scanner.nextInt();
            if (money != milk) {
                System.out.println("Please, " + milk + " euros, boy!");
                money = scanner.nextInt();
                if (money != milk) {
                    System.out.println("Sorry, no milk for you!");
                }   else {
                    System.out.println("Thank you for shopping, come again!");
                }

            }   else {
                System.out.println("Thank you for shopping, come again!");
            }
        } else {
            System.out.println("Thank you, come again!");
        }

        System.out.println("Would you like to buy wine");

    }
}
