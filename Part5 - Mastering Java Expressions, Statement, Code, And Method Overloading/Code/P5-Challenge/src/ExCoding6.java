public class ExCoding6 {

    // Kiểm tra 2 số double có bằng nhau đến 3 chữ số thập phân hay không
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
