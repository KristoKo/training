package May24;
//we enter the length of array 1 and element values, we do the same for array 2 and compare them.
import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Array1: ");
        int len1 = scanner.nextInt();
        System.out.println("Enter the values of Array1: ");

        int[] array1 = new int[len1];
        for (int i = 0; i<len1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the length of Array2: ");
        int len2 = scanner.nextInt();
        System.out.println("Enter the values of Array2: ");

        int[] array2 = new int[len2];
        for (int i = 0; i<len2; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 1: " + Arrays.toString(array2));

        boolean equal = true;

        if (len1 == len2) {
            for (int i = 0; i<len1; i++) {
                if (array1[i] != array2[i]) {
                    equal = false;
                }
            }
        } else {
            equal = false;
        }

        if (equal) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays not equal.");
        }


    }
}
