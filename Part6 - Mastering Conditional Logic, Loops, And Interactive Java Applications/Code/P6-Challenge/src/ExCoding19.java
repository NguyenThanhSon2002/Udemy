public class ExCoding19 {

    // Checking For A Shared Digit Between Two Numbers
    static void main(String[] args) {

    }

    //    public static boolean hasSharedDigit (int number1, int number2) {
    //        if (number1 <= 10 || number1 >= 99 || number2 <= 10 || number2 >= 99) {
    //            return false;
    //        }
    //
    //        int number1FirstDigit = number1 / 10;
    //        int number1LastDigit = number1 % 10;
    //        int number2FirstDigit = number2 / 10;
    //        int number2LastDigit = number2 % 10;
    //
    //        if (number1FirstDigit == number2FirstDigit || number1FirstDigit == number2LastDigit) {
    //            return true;
    //        } else if (number1LastDigit == number2FirstDigit || number1LastDigit == number2LastDigit) {
    //            return true;
    //        } else {
    //            return false;
    //        }
    //    }

    public static boolean hasSharedDigit(int first, int second) {

        boolean firstValid = first > 9 && first < 100;
        boolean secondValid = second > 9 && second < 100;

        if (!firstValid || !secondValid) {
            return false;
        }

        int firstLeftDigit = first / 10;
        int firstRightDigit = first % 10;
        int secondLeftDigit = second / 10;
        int secondRightDigit = second % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }
}
