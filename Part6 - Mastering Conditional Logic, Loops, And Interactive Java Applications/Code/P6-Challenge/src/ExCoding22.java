public class ExCoding22 {

    // Deriving The Greatest Common Divisor (GCD) Efficiently
    static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    //    public static int getGreatestCommonDivisor (int first, int second) {
    //        if (first < 10 || second < 10) {
    //            return -1;
    //        }
    //
    //        int greatestCommonDivisor1 = 0;
    //        int greatestCommonDivisor2 = 0;
    //
    //        if (first >= second) {
    //            for (int i = 1; i <= first/2; i++) {
    //                if (first % i == 0 && second % i == 0) {
    //                    greatestCommonDivisor1 = i;
    //                }
    //            }
    //            return greatestCommonDivisor1;
    //        }else if (first < second) {
    //            for (int i = 1; i <= second/2; i++) {
    //                if (first % i == 0 && second % i == 0) {
    //                    greatestCommonDivisor2 = i;
    //                }
    //            }
    //            return greatestCommonDivisor2;
    //        } else {
    //            return -1;
    //        }
    //    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int min = first < second ? first : second;
        int gcd = 1;
        for (int j = 1; j <= min; j++) {
            if (first % j == 0 && second % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
