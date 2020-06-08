package Homework;

import java.util.Arrays;

public class ExercisesArray {
    public static void main(String[] args) {

    }

        //exercise 10 bugggggg
/*

    int[] a = new int[]{1, 2, 7, 3, 10, 2, 9};
    int sum = 4;

//public static void findPairsWhoseSumIs(int[] a, int sum){ for(int i = 0; i < a.length; i++){ for(int j = i + 1; j < a.length; j++){ if(a[i] + a[j] == sum){ System.out.println(a[i] + " & " + a[j]); } } } }
//private static void isPairEqualToSum(int a[], int sum) { Arrays.sort(a); int l, r; l = 0; r = a.length - 1; while (l <= r) { if (a[l] + a[r] == sum) { System.out.println(a[l] + "-" + a[r]); l++; r--; } else if (a[l] + a[r] < sum) { l++; } else { r--; } } }
    }
    private static void isPairEqualToSum(int a[], int sum){
        Arrays.sort(a);
        int l, r;
        l=0;
        r=a.length -1;

        while (l < r) {
            if (a[l] + a[r] == sum) {
                System.out.println(a[l] + "-" + a[r]);
                l++;
                r--;
            } else if (a[l] + a[r] < sum) {
                l++;
            } else {
                r--;
            }
        }



    }

*/



 //   private static void secondLargestElement(int[] a){ int max = 0; int secondLargest = 0; for(int i = 0; i < a.length; i++){ if(a[i] > max){ max = a[i]; } } for(int i = 0; i < a.length; i++){ if(a[i] > secondLargest && a[i] < max){ secondLargest = a[i]; } } System.out.println(secondLargest); }

  /*

        //ex9
        int[] a = new int[]{1, 7, 3, 10, 9};




    }

    private static void secondLargestElement(int[] a) {

        int first =
        for (int i = 0; i < a.length; i++) {
            if ()


        }

    }

    */



    //exercise 8 in arrays

/*
    public static void main(String[] args) {
        int[] a = new int[]{1, 7, 3, 7, 10, 1, 9};
        printDuplicate(a);

    }

    private static void printDuplicate(int a[]) {
        for (int i=0; i < a.length -1; i++) {
            for (int j = i+1; j<a.length; j++) {
                if ((a[i] == a[j]) && (i!=j)) {
                    System.out.println(a[j]);
                }
            }
        }
    }

*/


//exercise 7 in arrays
  /*
    public static void main(String[] args) {
        int[] a = new int[]{1, 7, 3, 10, 9};

        int[] newArray = insert(4, 2, a);

        for (int n: newArray) {
            System.out.println(n + " ");
        }

    }

    private static int[] insert(int num, int pos, int[] a) {
        int new_len = a.length +1;
        int[] n_array = new int[new_len];
        for(int i = 0; i < pos; i++) {
            n_array[i] = a[i];
        }
        n_array[pos] = num;
        for(int i = pos+1; i < a.length; i++) {
            n_array[i] = a[i];
        }
        return n_array;


    }  */
}
