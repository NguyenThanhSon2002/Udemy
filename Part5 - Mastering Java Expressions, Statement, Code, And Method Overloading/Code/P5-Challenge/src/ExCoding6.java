public class ExCoding6 {

    //Building A Decimal Comparator To Practice Floating-Point Comparisons In Java
    static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }

    //    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
    //       if ((long) (number1 * 1000) == (long) (number2 * 1000)) {
    //           return true;
    //       } else {
    //           return false;
    //       }
    //    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        long firstRounded = (long) (first * 1000);
        long secondRounded = (long) (second * 1000);
        return firstRounded == secondRounded;
    }

}
