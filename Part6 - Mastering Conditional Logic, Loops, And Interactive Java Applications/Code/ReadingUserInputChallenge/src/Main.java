import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int count = 1;
        do {
            System.out.println("Enter number #" + count);
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                sum += number;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid number");
                scanner.next();
            }
        } while (count <= 5);

        System.out.println(sum);
    }


}