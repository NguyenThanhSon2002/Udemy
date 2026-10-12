public class Main {

    public static void main(String[] args) {

        //        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        //        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        //        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        //        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        //
        //        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        //        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");

        int primeNumberCounter = 0;

        //        for (int number = 10; number <= 50; number++){
        //            if (isPrime(number)) {
        //                System.out.println("number " + number + " is a prime number");
        //                primeNumberCounter++;
        //                if (primeNumberCounter > 2) {
        //                    System.out.println("Found 3 - Exiting for loop");
        //                    break;
        //                }
        //            }
        //        }

        for (int number = 10; primeNumberCounter < 3 && number <= 50; number++){
            if (isPrime(number)) {
                System.out.println("number " + number + " is a prime number");
                primeNumberCounter++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}