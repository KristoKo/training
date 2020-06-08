package Homework;

public class Exercises2 {
    public static void main(String[] args) {

        //exc 3
            stringFnc();
    }

    static void stringFnc() {


//exc3
        String a = " THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println(a.toLowerCase());

  //      String b = "JAVA";
  //      for (int i = b.length() -1 ; i>= 0; i--) {
  //          System.out.print(b.charAt(i));
  //      }



        // exc5
     //   String c = "Programmer";
     //   int l = c.length()/2;
     //   System.out.print(c.substring(0, l));



     //   exc6;
     //   String a = "Java";
     //   String b = "Fundamentals";
     //   System.out.print(a.substring(0, i));


     //   exc 8;
     //   string.equalsIgnoreCase()





    //exc 10

        String c = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        countEverything(c);
    }
        public static void countEverything(String test){
            char[] chars = test.toCharArray();
            int letter = 0;
            int spaces = 0;
            int numbers = 0;
            int other = 0;

            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(chars[i])) {
                    letter++;
                } else if (Character.isDigit(chars[i])) {
                    numbers++;
                } else if (Character.isSpaceChar(chars[i])) {
                    spaces++;
                } else {
                    other++;
                }
            }

            System.out.print(letter + " letters, ");
            System.out.print(spaces + " spaces, ");
            System.out.print(numbers + " numbers, ");
            System.out.print(other + " others");


        }

}