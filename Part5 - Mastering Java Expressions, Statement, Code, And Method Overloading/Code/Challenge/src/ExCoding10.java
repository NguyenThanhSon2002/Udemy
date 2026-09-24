public class ExCoding10 {

    static void main(String[] args) {
        printYearsAndDays(-561600);
    }

    //    public static void printYearsAndDays (long minutes) {
    //        if (minutes < 0) {
    //            System.out.println("Invalid Value");
    //        } else {
    //            int year = (int) minutes / 525600;
    //            int day = (int) (minutes % 525600) / (60*24);
    //            System.out.println(minutes + " min = " + year + " y and " + day + " d");
    //        }
    //    }

    private static final int MIN_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int DAYS_PER_YEAR = 365;
    private static final int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
    private static final int MIN_PER_YEAR = MIN_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / MIN_PER_YEAR;
        long days = (minutes / MIN_PER_DAY) % DAYS_PER_YEAR;
        System.out.println(minutes + " min = " + years  + " y and " + days + " d");
    }


}
