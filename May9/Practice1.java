package May9;

public class Practice1 {

    //    ns: 1, 2, 3, 4, 5, 6, ...
    //values: 1, 1, 2, 3, 5, 8, ...



    private static int value(int n) {
        //xn = xn-1 + xn-2
        int[] elements = new int[n+2];
        elements[0] = 1;
        elements[1] = 1;


  //      private static int calculate(int n) {
       for (int i = 2; i < n ; i++) {
//        int el2 = 1;

  //          for (int i=2; i<n; i++) {
    //            int newEl = el2 + el1;
      //          el1 = el2;
      //          el2 = newEl;

      //      }
      //      return el2;
      //  }
        //    int el1 = elements[i-2];
   //         int el2 = elements[i-1];
  //          int newEl = el2 + el1;

//            el1 = el2;
 //           el2 = newEl;
        //      return el2;
            elements[i] = elements[i - 1] + elements[i - 2];
        }

        return elements[n-1];
    }


    public static int calculateFibonacci2(int n) {  //n = 2
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

     //   int a = calculateFibonacci2((n-1) + (n-2));
        int n1 = calculateFibonacci2(n-1);
        int n2 = calculateFibonacci2(n-2);

        return n1+n2;

                //sum (n-1 + n-2)
    }

    public static void main(String[] args) {
        calculateFibonacci2(2);
        for (int i = 3; i < 20; i++) {
            System.out.println(i + "the element is " + calculateFibonacci2(i));
        }
    }
}
