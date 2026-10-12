public class ExCoding15 {

    // Summing Odd Numbers In A Specified Range
    static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(10, 20));
        System.out.println(sumOdd(100, 1000));
    }

    //    public static boolean isOdd (int number) {
    //        if (number < 0) {
    //            return false;
    //        }
    //        return (number % 2 == 1);
    //    }
    //
    //    public static int sumOdd (int start, int end) {
    //        int result = 0;
    //
    //        if (start >= 0 && start <= end) {
    //            if (isOdd(start)) {
    //                for (int i = start; i <= end; i += 2) {
    //                    if (isOdd(i)){
    //                        result += i;
    //                    }
    //                }
    //                return result;
    //            } else {
    //                for (int i = start + 1; i <= end; i += 2) {
    //                    if (isOdd(i)){
    //                        result += i;
    //                    }
    //                }
    //                return result;
    //            }
    //        } else  {
    //            return -1;
    //        }
    //    }

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {

        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
