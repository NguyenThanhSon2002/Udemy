public class ExCoding23 {

    // Confirming Perfect Numbers Through Sum Of Proper Divisors
    static void main(String[] args) {

        System.out.println(isPerfectNumber(28));
    }

    //    public static boolean isPerfectNumber (int number) {
    //        if (number < 1) {
    //            return false;
    //        }
    //
    //        int sum = 0;
    //
    //        for (int i = 1; i <= number/2; i++) {
    //            if(number % i == 0){
    //                sum += i;
    //                if (sum == number){
    //                    return true;
    //                }
    //            }
    //        }
    //
    //        return false;
    //    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

}
