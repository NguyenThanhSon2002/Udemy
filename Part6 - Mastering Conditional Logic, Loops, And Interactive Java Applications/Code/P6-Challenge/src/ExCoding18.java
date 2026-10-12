public class ExCoding18 {

    // Calculating The Sum Of All Even Digits In An Integer
    static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));

    }

    //    public static int getEvenDigitSum (int number) {
    //        if (number < 0) {
    //            return -1;
    //        }
    //
    //        int sum = 0;
    //        while (number > 0) {
    //            if (number % 2 != 0) {
    //                number = number / 10;
    //                continue;
    //            }
    //            sum += number % 10;
    //            number /= 10;
    //        }
    //        return sum;
    //    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }

        // == alternative using while loop ==
        // while (number > 0) {
        //     int lastDigit = number % 10;
        //     if (lastDigit % 2 == 0) {
        //         sum += lastDigit;
        //     }
        //     number /= 10;
        // }

        return sum;
    }

}
