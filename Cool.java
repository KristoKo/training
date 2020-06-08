package May9;


import java.util.Arrays;

public class Cool {

    private static String[] removeCensored(String[] text, String[] censoredWords) {

        String[] result = text;
        int position = 0;
        for (String el : text) {
            if (isInArray(censoredWords, el)) {
                result[position] = "";
            }
            position++;
        }
        return result;

    }


    private static boolean isInArray(String[] array, String el) {
        for (String element : array) {
            if (element.equals(el)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String[] text = {"I", "really", "do", "not", "like", "Java"};
        String[] censoredWords = {"banana", "do", "kiwi", "not"};
        String[] result = removeCensored(text, censoredWords);
        System.out.println(Arrays.toString(result));

        // result should be equal to {"I", "really", "", "", "like", "Java"};

    }




}
