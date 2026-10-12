import java.util.Scanner;

public class ExCoding28 {

    // Interactive Summation And Average Calculator From User Input
    static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    //    public static void inputThenPrintSumAndAverage() {
    //        Scanner scan = new Scanner(System.in);
    //
    //        int sum = 0;
    //        long average = 0;
    //        int count = 0;
    //
    //        while (scan.hasNextInt()) {
    //            int number = scan.nextInt();
    //            sum += number;
    //            count++;
    //
    //        }
    //        try {
    //            average = Math.round((double) sum/count);
    //            System.out.println("SUM = " + sum + " AVG = " + average);
    //        } catch (ArithmeticException e) {
    //            System.out.println("SUM = 0 AVG = 0");
    //        }
    //    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                // break the loop on invalid input
                break;
            }
            sum += scanner.nextInt();
            count++;
            // clear buffer e.g. remove line separator
            scanner.nextLine();
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
