public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Son");
        System.out.println("Hello World");

        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("It is not an Alien");
            System.out.println("And I'm scared of Alien");

        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("Either or Both condition are true");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

        if (!isDomestic) {
            System.out.println("This car is domestic to our Country");
        }

        String s = (isDomestic) ? "This car is domestic to our Country" : "This car is not domestic to our Country";
        System.out.println(s);

        System.out.println("-------------------------------");

        double doubleValue = 20.00d;
        double doubleValue2 = 80.00d;
        double result = (doubleValue + doubleValue2) * 100;
        double result2 = result % 40.00;
        boolean isExactDivision = (result2 == 0) ? true : false;
        System.out.println(isExactDivision);
        if (isExactDivision == false) {
            System.out.println("Got some remainder");
        }
    }
}
