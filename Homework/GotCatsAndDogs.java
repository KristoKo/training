package April25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // the EZ part
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name, gender and ID number, each followed with 'enter'");
        String name = input.nextLine();
        String gender = input.nextLine();
        int id = Integer.parseInt(input.nextLine());

        System.out.println("Your name is " + name + ", you are " + gender + " and your ID number is " + id + "!");

        // pets
        Cat cat = new Cat();
        Dog dog = new Dog();

        String petName = "";
        String catOrDog = "";
        String breed = "";
        int age = -1;
        cat.setAge(-1);
        dog.setAge(-1);


        do {
            System.out.println("If you have any cats or dogs, please enter his/her name, if not, type 'nope'");
            petName = input.nextLine();
            if (petName.equals("nope")) {
                break;
            }
            System.out.println("Is it a dog or a cat?");
            catOrDog = input.nextLine();

            while (!catOrDog.equals("cat") && !catOrDog.equals("dog")) {  // making sure we have a pet here
                System.out.println("please tell me again, dog or a cat");
                catOrDog = input.nextLine();

            }

            System.out.println("Tell me its breed, please!");
            breed = input.nextLine();
            System.out.println("How old is your pet?");
            age = Integer.parseInt(input.nextLine());

            if (catOrDog.equals("cat")) {
                if (cat.getAge() < age) {
                    cat.setAge(age);
                    cat.setBreed(breed);
                    cat.setName(petName);
                }
            }

            if (catOrDog.equals("dog")) {
                if (dog.getAge() < age) {
                    dog.setAge(age);
                    dog.setBreed(breed);
                    dog.setName(petName);
                }
            }

        } while (true);

        if (cat.getAge() != -1) {
            System.out.println("Your cat named " + cat.getName() + " with an age of " + cat.getAge() + " says 'Mewww!'");
        }
        if (dog.getAge() != -1) {
            System.out.println("Your dog named " + dog.getName() + " with an age of " + dog.getAge() + " says 'Woof Woof!");
        }


    }


}
