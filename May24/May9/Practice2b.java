package May9;

import java.util.Arrays;
public class Practice2b {
    private static boolean isInArray(int[] array, int el) {
        for (int element : array) {
            if (element == el) {
                return true;
            }
        }
        return false;
    }
    // [1, 2, 4], [2, 5, 6, 4] --> [2, 4]
    private static int[] functionName(int[] firstArray, int[] secondArray) {
        int n1 = firstArray.length;
        int n2 = secondArray.length;
        int[] resultArray;
        if (n1 < n2) {
            resultArray = new int[n1];
        } else {
            resultArray = new int[n2];
        }
        int position = 0;
        for (int el : firstArray) {
            if (isInArray(secondArray, el)) {
                resultArray[position] =  el;
                position++;
            }
        }
        return resultArray;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4};
        int[] array2 = {2, 5, 6, 4};
        int[] intersectingArray = functionName(array1, array2);
        String array1Str = Arrays.toString(array1);
        System.out.println(array1Str);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(intersectingArray));
    }
}