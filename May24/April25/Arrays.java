package April25;

import java.util.Scanner;

public class Arrays {

    // number of cats, cat ages
    // 5 cats each cat inputs only age (cat0 cat1 cat2)
    // print out average age

    //numberofcats cat
    //read cat ages

    public static void main(String[] args) {




//number of cats cat

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cats do you have?");
        int animalCount = scanner.nextInt();

//read animal ages
//animal0 animal1

        Animal[] animals = new Animal[animalCount];


        for(int i = 0; i < animalCount; i++) {
            String name = "animal"+i;
            System.out.println("Tell me the age of your " + (i+1) + ". cat");
            int age = scanner.nextInt();

            //Animal animal = new Animal(name, age);
            //animals[i] = animal;
            //same as the next line:

            animals[i] = new Animal(name, age);
        }


//average age

        int totalAge = 0;
        //type variableName array
        for (Animal animalX : animals) {
            totalAge = totalAge + animalX.getAge();
            // totalAge += animalX.getAge();
        }


        int avgAge = totalAge/animalCount;

        System.out.println(avgAge);

    }

}
