public class ExCoding16 {

    // Identifying Palindromic Numbers For Enhanced Numeric Validation
    static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));

    }

    //    public static boolean isPalindrome (int number) {
    //        int revese = 0;
    //        int lastDigit = 0;
    //        int number1 = number > 0 ? number : -number;
    //        if (number < 0) {
    //            number = -number;
    //        }
    //        while(number > 0) {
    //            lastDigit = number % 10;
    //            revese = revese * 10 + lastDigit;
    //            number = number / 10;
    //        }
    //        return  revese == number1;
    //    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }


}
