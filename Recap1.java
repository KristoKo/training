package May10;

import java.util.Scanner;

public class Recap1 {

    private static String getCatName(Scanner input) {
        System.out.println("Tell me the cat name");
        String catName = input.nextLine();
        return catName;
    }

    private static int getCatAge(Scanner inputReader) {
        System.out.println("Tell me the cat age");
        int catAge = inputReader.nextInt();
        return catAge;
    }

    private static void stringExample1() {
        // show why not use == with Strings
        String a1 = "bla";
        Scanner scn = new Scanner(System.in);
        String a2 = scn.nextLine(); // type in bla
        System.out.println(a1);
        System.out.println(a2);
        if (a1 == a2) {
            System.out.println("true");
        }
    }

    // returnType functionName(arguments)
    // arguments --> argumentType argumentName, argumentType argumentName, ...
    public static void main(String[] args) {
        int b = 2;
        int valueIfTrue = 2;
        int valueIfFalse = 5;
        boolean condition = b == 2;
        int a = condition ? valueIfTrue : valueIfFalse;


        boolean condition2 = a > b;
        boolean valueIfTrue2 = false;
        boolean valueIfFalse2 = true;
        boolean c = condition2 ? valueIfTrue2 : valueIfFalse2;
        boolean d = !condition2;

        String cat1 = "fifi";
        int cat1Age = 4;
        String cat2 = "john";
        int cat2Age = 3;

        String nameAndAge = "fifi 4";
        String[] nameAndAgeArray = nameAndAge.split(" ");

        Scanner inputReader = new Scanner(System.in);
        String catName = getCatName(inputReader);
        int catAge = getCatAge(inputReader);

        // if age and name match --> we have cat
        // if only name match --> that cat has different age
        // if only age match --> cat that old has different name
        // if nothing matches --> no that kind of cats

        if ((catName.equals(cat1) && catAge == cat1Age) || (catName.equals(cat2) && catAge == cat2Age)) {
            System.out.println("We have a cat");
        } else if (catName.equals(cat1) || catName.equals(cat2)) {
            System.out.println("That cat has different age");
        } else if (catAge == cat1Age || catAge == cat2Age) {
            System.out.println("Cat that old has different name");
        } else {
            System.out.println("No that kind of cats");
        }
    }
}
