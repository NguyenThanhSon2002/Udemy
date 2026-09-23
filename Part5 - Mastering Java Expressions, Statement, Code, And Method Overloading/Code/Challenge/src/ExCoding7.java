public class ExCoding7 {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 2, 3));
    }

    //    public static boolean hasEqualSum(int number1, int number2, int number3) {
    //        if (number1 + number2 == number3) {
    //            return true;
    //        } else {
    //            return false;
    //        }
    //    }

    public static boolean hasEqualSum(int a, int b, int c) {
        return (a + b) == c;
    }
}
