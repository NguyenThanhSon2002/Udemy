public class ExCoding14 {

    // Computing Month Length With Leap Year Consideration
    static void main(String[] args) {

        System.out.println(isLeapYear(-1024));
        System.out.println(getDaysInMonth(2, -1024));

    }

    //    public static boolean isLeapYear(int year) {
    //        if (year < 1 || year > 9999) {
    //            return false;
    //        } else {
    //            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    //                return true;
    //            } else {
    //                return false;
    //            }
    //        }
    //    }
    //
    //    public static int getDaysInMonth (int month, int year) {
    //        if (month < 1 || month > 12 || year < 1 || year > 9999) {
    //            return -1;
    //        } else {
    //            if (isLeapYear(year)) {
    //                switch (month) {
    //                    case 1, 3, 5, 7, 8, 10, 12 -> {
    //                        return 31;
    //                    }
    //                    case 2 -> {
    //                        return 29;
    //                    }
    //                    case 4, 6, 9, 11 -> {
    //                        return 30;
    //                    }
    //                    default -> {
    //                        return -1;
    //                    }
    //                }
    //            } else {
    //                switch (month) {
    //                    case 1, 3, 5, 7, 8, 10, 12 -> {
    //                        return 31;
    //                    }
    //                    case 2 -> {
    //                        return 28;
    //                    }
    //                    case 4, 6, 9, 11 -> {
    //                        return 30;
    //                    }
    //                    default -> {
    //                        return -1;
    //                    }
    //                }
    //            }
    //        }
    //    }

    public static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9_999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;  // for any of the following months, return 31
            case 2 -> isLeapYear(year) ? 29 : 28; // if it's February, determine if it's a leap year first, then return either 28 or 29.
            case 4, 6, 9, 11 -> 30; // return 30 for the following months
            default -> -1; // return -1 if the month parameter is not between 1 and 12.
        };
    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9_999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

}