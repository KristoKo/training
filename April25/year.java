package April25;

public class year {


    public static boolean IsLeapYear(int year) {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

        public static void main(String[]args){
            if (IsLeapYear(2020)) {
                System.out.println("Is leap year!");
            } else {
                System.out.println("Not leap year");
            }

        }

    }