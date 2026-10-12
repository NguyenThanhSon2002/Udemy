public class ExCoding20 {

    // Evaluating The Last Digit For Multiple Integer Comparisons
    static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));

    }

    //    public static boolean hasSameLastDigit (int number1, int number2, int number3) {
    //        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
    //            return false;
    //        }
    //
    //        int lastDigitNumber1 = number1 % 10;
    //        int lastDigitNumber2 = number2 % 10;
    //        int lastDigitNumber3 = number3 % 10;
    //
    //        boolean firstShared = lastDigitNumber1 == lastDigitNumber2 || lastDigitNumber1 == lastDigitNumber3 || lastDigitNumber2 == lastDigitNumber3;
    //
    //        return firstShared;
    //
    //    }
    //
    //    public static boolean isValid (int number){
    //        if (number < 10 || number > 1000) {
    //            return false;
    //        }
    //        return true;
    //    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
    }
}
