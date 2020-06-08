package April26;

import April25.Cat;

import java.util.Scanner;

public class AArrays {

    public static void main(String[] args) {




     //   String[];  // array of strings
     //   String[][]; //array of array of strings

        int[] numbers = new int[3];   //just creates 3 spaces for, does not initialize! (not calling constructor)

      //  Cat[] cats = new Cat[3];         //we have array of n cats
      //  cats[1] = new Cat();          //initializes (calls a cat constructor)



     //   cat4.getName();
     //   cats[2].getName();        //cats of two element?




        int n = 3;
        Cat[] cats = new Cat[n];

        for (int i = 0; i < n; i++) {
            //give me cat name and stuff
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
        //    cats[i] = new Cat(name);   //cats is an array,  cats[0] is a cat variable

        }



        for (int i = 0; i < cats.length; i++) {
            Cat cat = cats[i];
            System.out.println(cat.getName());
        }


        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }









        String[] arrayOfStrings = new String[2];
        // initialization
        arrayOfStrings[0] = "Tree";
        arrayOfStrings[1] = "Forest";
        // for(int i = 0; i < arrayOfStrings[n] ; i++) {
        //    String s = arrayOfStrings[i];
        //    System.out.println(s);



        //type[] variableName = new type[numberOfElements];

        //int[] arrayOfInts = {10, 15, 20, 25, 30};  //does the same as

        //int[] arrayofIntsSame = new int[5];        //this
        //arrayofIntsSame[0] = 10;
        //arrayofIntsSame[1] = 15;
        //arrayofIntsSame[3] = 20;
        //arrayofIntsSame[4] = 25;
        //arrayofIntsSame[5] = 30;



        //for (type variableName : array)   special for loop to write all the elements of the array

        //for(int arrayElement : arrayofIntsSame) {
        //    System.out.println(arrayElement);
        //}

        //same as this

        //int elementOfArray;
        //for(int i = 0; i < arrayofIntsSame.length ; i++) {
        //    elementOfArray = arrayofIntsSame[i];
        //    System.out.println(elementOfArray);

        }




        //Cat alise = new Cat(name:"alise");
        //Cat[] cats = {new Cat(name:"bob"), alise};




}