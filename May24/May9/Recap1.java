package May9;

import java.util.Scanner;

public class Recap1 {


    //returnType functionName(arguments)
    //arguments --> argumentType argumentName, argumentType argumentName, ...
    //private static Scanner input = new Scanner(System.in);

    private static String getName(Scanner input) {
        System.out.println("cat name");
        String name = input.nextLine();
        return name;
    }

    private static int getAge(Scanner input) {
        System.out.println("cat age");
        int age = input.nextInt();
        return age;
    }


    public static void main(String[] args) {

        //comparison
        //boolean
        //int x = condition ? value_if_true : value_if_false;

        int b = 2;
        //int value_if_true = 2;

        int a = b == 2 ? 2 : 5;

        //a=2 if b = 2 else 5

        int z = 2;
        int valueIfTrue = 2;
        int valueIfFalse = 5;
        boolean condition = z == 2;
        int x = condition ? valueIfTrue : valueIfFalse;

/*
    String cat1 = "fifi";
    String cat2 = "john";
    int cat1Age = 4;
    int cat2Age = 3;
*/

        //   String catName = getName(input);
        //   int catAge = getAge(input);
/*
    if (catName == cat1 && catAge == cat1Age || catName == cat2 && catAge == cat2Age) {
        System.out.println("We have a cat");
    }   else if (catName == cat1 || catName == cat2) {
        System.out.println("That cat has a different age");
    }   else if (catAge == cat1Age || catAge == cat2Age) {
        System.out.println("Cat that old has different name");
    }   else {
        System.out.println("No cat like that here");
    }

//read text from user and print it out with words in the array words being in uppercase

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();
        String[] words = {"bla", "banana"};
        String upCase = upCaseWords(userInput, words);

        System.out.println(upCase);
    }


    private static String upCaseWords(String text, String[] words) {
        String[] textWords = text.split(" ");
        return text;
    }
*/

}}
