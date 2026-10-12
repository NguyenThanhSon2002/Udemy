public class ExCoding26 {

    // Identifying The Largest Prime Factor Of A Number
    static void main(String[] args) {
        System.out.println(getLargestPrime(45));

    }

    //    public static int getLargestPrime (int number) {
    //        if (number < 2) {
    //            return -1;
    //        }
    //
    //        int factor = 2;
    //
    //        while (number > 0) {
    //            if (number % factor == 0) {
    //                number = number / factor;
    //                if (number == 1) {
    //                    System.out.println(factor);
    //                    break;
    //                }
    //            } else {
    //                factor++;
    //            }
    //        }
    //
    //
    //        return factor;
    //    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }
}
