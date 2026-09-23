public class ExCoding8 {

    public static void main(String[] args) {

    }

    //    public static boolean hasTeen(int number1, int number2, int number3) {
    //        if (13 <= number1 && number1 <= 19 || 13 <= number2 && number2 <= 19 || 13 <= number3 && number3 <= 19) {
    //            return true;
    //        } else {
    //            return false;
    //        }
    //    }
    //
    //    public static boolean isTeen(int number1) {
    //        if (13 <= number1 && number1 <= 19) {
    //            return true;
    //        } else {
    //            return false;
    //        }
    //    }


    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int number) {
        return number > 12 && number < 20;
    }
}
