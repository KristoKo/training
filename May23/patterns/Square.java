package May23.patterns;

public class Square {


    public void draw() {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if ((i == 0) || (j == 0)) {
                    System.out.print("* ");
                }   else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
