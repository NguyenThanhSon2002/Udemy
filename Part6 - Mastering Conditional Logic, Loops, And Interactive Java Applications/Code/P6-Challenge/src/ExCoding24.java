public class ExCoding24 {

    // Converting Digits Into Words And Handling Edge Cases
    static void main(String[] args) {
        numberToWords(101010000);

    }

    //    public static int reverse(int number) {
    //        int reversed = 0;
    //        while (number != 0) {
    //            reversed = reversed * 10 + number % 10;
    //            number = number / 10;
    //        }
    //        return reversed;
    //
    //    }
    //
    //    public static int getDigitCount(int number) {
    //        if (number < 0) {
    //            return -1;
    //        }
    //        if (number == 0) {
    //            return 1;
    //        }
    //        int count = 0;
    //        while (number > 0) {
    //            count++;
    //            number /= 10;
    //        }
    //        return count;
    //    }
    //
    //
    //    public static void numberToWords (int number) {
    //        if (number < 0) {
    //            System.out.println("Invalid Value");
    //            return;
    //        }
    //
    //        if (number == 0) {
    //            System.out.println("Zero");
    //            return;
    //        }
    //
    //        int lastDigitNumber = 0;
    //        int reverse = reverse(number);
    //        int leadDigitIsZero = getDigitCount(number) - getDigitCount(reverse);
    //
    //        while (reverse > 0) {
    //            lastDigitNumber = reverse % 10;
    //            reverse = reverse / 10;
    //
    //            switch (lastDigitNumber) {
    //                case 0:
    //                    System.out.print("Zero ");
    //                    break;
    //                case 1:
    //                    System.out.print("One ");
    //                    break;
    //                case 2:
    //                    System.out.print("Two ");
    //                    break;
    //                case 3:
    //                    System.out.print("Three ");
    //                    break;
    //                case 4:
    //                    System.out.print("Four ");
    //                    break;
    //                case 5:
    //                    System.out.print("Five ");
    //                    break;
    //                case 6:
    //                    System.out.print("Six ");
    //                    break;
    //                case 7:
    //                    System.out.print("Seven ");
    //                    break;
    //                case 8:
    //                    System.out.print("Eight ");
    //                    break;
    //                case 9:
    //                    System.out.print("Nine ");
    //                    break;
    //                default:
    //                    System.out.println("Invalid Value");
    //                    break;
    //            }
    //        }
    //
    //        for (int i = 0; i < leadDigitIsZero; i++){
    //            System.out.print("Zero ");
    //        }
    //    }

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {
            // multiply by 10 then and add last digit (number % 10)
            reverse = reverse * 10 + number % 10;
            number /= 10; // discard last digit
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        // start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
        // count how many times it was multiplied, and that's the digit count
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // get reversed number
        int reverse = reverse(number);

        // subtract numberDigits and reverseDigits to get leading zeroes
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        // use loop to print words
        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse /= 10;
        }

        // print zeroes if there are any leading zeroes in reversed number
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
    }
}
