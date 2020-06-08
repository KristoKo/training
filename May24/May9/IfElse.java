package May9;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you cool? Please answer, yes or no");
        String statement = scanner.nextLine();

        if (statement.equals("yes")) {
            System.out.println("You are cool!");
        }   else {
            System.out.println("You are not cool!");
        }
    }
}
