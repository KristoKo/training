package May24;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

//Write an application that will find biggest value within array of int variables.

public class ProjectArray {
    public static void main(String[] args) {

        Random random = new Random();


        int n = 5;

        for (int k = 0; k<n; k++) {
            int[] newArray = new int[10];
            for(int i=0; i<newArray.length; i++) {
                newArray[i] = random.nextInt(100);
            }

            System.out.println(Arrays.toString(newArray));
            Arrays.sort(newArray);
            System.out.println("The biggest value in array: " + newArray[9] +"");
            System.out.println();
        }






     /*   for()
        double randomNumber = Math.random();
        Random random = new Random();

        int[] arrayOfInts = new int[10];
        for (int i = 0; i < arrayOfInts.length; i++)
            arrayOfInts[i] = random.nextInt(101);

        System.out.print(Arrays.toString(arrayOfInts));


      */

    }
}
