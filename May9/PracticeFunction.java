package May9;

public class PracticeFunction {
    private static int addOne(int a) {
        System.out.println("addOne: " + a);
        a = a+1;
        System.out.println("addOne: " + a);
        return a;
    }

    public static void example1() {
        int a = 7;
        System.out.println(a);
        int returnOfAddOne = addOne(a); // a = 7, return is 8
        System.out.println("returnOfAddOne: " + returnOfAddOne);
        a = a + returnOfAddOne; // returnOfAddOne = 8, a was = 7; new a = 15
        a = addOne(a); // a = 15, return is = 16, new a = 16
        a = addOne(a); // a = 16, return is 17
        System.out.println(addOne(a)); // a = 17, return is = 18
    }

    private static void addOne(Integer a) {
        System.out.println("addOne: " + a); // a = Integer(val: 7)
        int b = a.val + 1; // a.val = 7; b = 8
        // a = new Integer(b); // a = Integer(val: 8)
        // a = new Integer(7); // a = Integer(val: 7)

        a.val = b; // a = Integer(val: 8)

        System.out.println("addOne: " + a);
    }

    public static void example2() {
        Integer a = new Integer(7); // a = Integer(val: 7)
        System.out.println(a); // a = Integer(val: 7)
        System.out.println(a.val); // a.val = 7

        addOne(a); // before: a = Integer(val: 7); after: a = Integer(val: 8)
        System.out.println(a);
        System.out.println(a.val);
    }

    public static void main(String[] args) {
        // example1();
        example2();
    }
}
//
// 7
// addOne
// return to line 13