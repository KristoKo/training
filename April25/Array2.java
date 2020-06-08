package April25;

import java.util.Scanner;

// how many animals that are older than 5
// user tells many names and ages of many animals
// we need to save the ones that are older than 5

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //how many animals that are older than 5
        System.out.println("How many animals are older than 5?");
        int numberOfOlderCats = scanner.nextInt();

        String[] animalNames = new String[numberOfOlderCats];
        int[] animalAges = new int[numberOfOlderCats];


        for (int i = 0; i < numberOfOlderCats; ) {
            System.out.println("What is the name of animal?");
            String animalName = scanner.nextLine();

            int animalAge = scanner.nextInt();

            if (animalAge > 5) {
               animalNames[i] = animalName;
               animalAges[i] = animalAge;
               i++;
            }
        }

        for (int i = 0; i < numberOfOlderCats; i++) {
            System.out.println("Animal: " + animalNames[i] + " is " + animalAges[i]);
        }



    }


}
