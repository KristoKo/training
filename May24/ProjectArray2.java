package May24;

import java.util.Arrays;
import java.util.Random;

public class ProjectArray2 {

    public static void main(String[] args) {

        //ascii ???
        int leftLimit = 97;
        int rightLimit = 122;
        int loop = 5;



        for(int i = 0; i < loop; i++) {
            Random random = new Random();
            String[] randomStringArray = new String[5];
            for (int j=0; j<randomStringArray.length; j++) {
                int targetLength = random.nextInt(10);

                StringBuilder builder = new StringBuilder(targetLength);

                for (int s=0; s<targetLength;s++) {
                    int randomChar = leftLimit + (int)(random.nextFloat() * (rightLimit-leftLimit +1));
                    builder.append((char) randomChar);
                }
                String generatedString = builder.toString();
                randomStringArray[j] = generatedString;
            }
            System.out.println(Arrays.toString(randomStringArray));

            int maxLength = randomStringArray[0].length();
            int maxIndex = 0;
            for (int s = 0; s<randomStringArray.length; s++) {
                if (randomStringArray[s].length() > maxLength) {
                    maxLength = randomStringArray[s].length();
                    maxIndex = s;
                }
            }

            System.out.println("MaxSequence: " + randomStringArray[maxIndex]);

        }



        /*
        Random random = new Random();
        int leftLimit = 97; //a
        int rightLimit = 122; //z
        int targetLength = random.nextInt(10);

        StringBuilder buffer = new StringBuilder(targetLength);
        for (int i = 0; i < targetLength; i++) {
            int randomInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit +1));
            buffer.append((char) randomInt);
        }

        String randomStr = buffer.toString();

        System.out.println(randomStr);

 */
    }
}
