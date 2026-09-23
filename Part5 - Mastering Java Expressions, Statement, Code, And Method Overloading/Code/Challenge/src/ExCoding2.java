public class ExCoding2 {

    // Đổi km -> mile
    static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
    }

    //    public static long toMilesPerHour(double kilometersPerHour) {
    //        if (kilometersPerHour < 0)
    //            return -1L;
    //
    //        long milesPerHour = Math.round(kilometersPerHour / 1.609);
    //        return milesPerHour;
    //    }
    //
    //    public static void printConversion(double kilometersPerHour) {
    //        if (kilometersPerHour < 0) {
    //            System.out.println("Invalid Value");
    //        } else {
    //            long milesPerHour = toMilesPerHour(kilometersPerHour);
    //            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    //        }
    //    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
