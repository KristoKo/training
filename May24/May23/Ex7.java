package May23;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to divide:");
        double value1 = scanner.nextDouble();
        System.out.println("Please enter a number to divide by:");
        double value2 = scanner.nextDouble();
        double result = value1/value2;

        DecimalFormat decimalFormat = new DecimalFormat(("##.####"));

        do  {
            System.out.println(decimalFormat.format(result));
        }
        while (result/value2 != 0);
    }
}
