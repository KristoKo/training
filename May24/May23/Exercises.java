package May23;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number: ");
        int input = scanner.nextInt();

        if (input > 30) {
            System.out.println("Entered value " + input + " is greater than 30");
        }   else if (input == 30) {
            System.out.println("Entered value " + input + " is equal to 30");
        }   else {
            System.out.println("Entered value " + input + " is lower than 30");
        }
    }
}
