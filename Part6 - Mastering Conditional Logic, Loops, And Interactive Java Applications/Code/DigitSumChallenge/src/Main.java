public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(2));

    }

    //    public static int sumDigits (int number) {
    //        if (number < 0) {
    //            return -1;
    //        } else {
    //            int result = 0;
    //            int number1 = 0;
    //            while (number > 0) {
    //                number1 = number;
    //                number = number % 10;
    //                result += number;
    //                number = number1 / 10;
    //            }
    //            return result;
    //        }
    //
    //    }

    public static int sumDigits (int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }


}