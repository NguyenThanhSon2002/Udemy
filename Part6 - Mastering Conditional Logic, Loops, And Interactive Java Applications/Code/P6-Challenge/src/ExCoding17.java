public class ExCoding17 {

    // Summing The First And Last Digits Of An Integer
    static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(122));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(11));

    }

    //    public static int sumFirstAndLastDigit (int number) {
    //        if (number < 0) {
    //            return -1;
    //        } else if (number >= 10) {
    //            int firstDigit = 0;
    //            int lastDigit = number % 10;
    //
    //            while (number >= 10) {
    //                number /= 10;
    //                if (number < 10) {
    //                    firstDigit = number;
    //                    break;
    //                }
    //            }
    //            return firstDigit + lastDigit;
    //        } else {
    //            return number + number;
    //        }
    //    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;  // use % 10 to get last digit in a number.
        while (number >= 10) {
            number /= 10;  // divide with 10 until there is 1 digit left (< 10) to get first digit.  This is also equivalent to number = number / 10.
        }

        int firstDigit = number; // this is not necessary, but this makes it clear that number is now the first digit.
        return firstDigit + lastDigit;
    }

}
