public class Main {

    static void main(String[] args) {
        int value = 1;

    //        switch (value) {
    //            case 1:
    //                System.out.println("Value is 1");
    //                break;
    //            case 2:
    //                System.out.println("Value is 2");
    //                break;
    //            case 3: case 4: case 5:
    //                System.out.println("Value is 3 or 4 or 5");
    //                System.out.println("Actually it is a " + value);
    //            default:
    //                System.out.println("Value is not 1,2, 3");
    //                break;
    //        }

        switch (value) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actually it is a " + value);
            }
            default -> System.out.println("Value is not 1,2, 3");
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");


    }

    public static String getQuarter(String month) {
        //        switch (month) {
        //            case "JANUARY":
        //            case "FEBRUARY":
        //            case "MARCH":
        //                return "1st";
        //            case "APRIL":
        //            case "MAY":
        //            case "JUNE":
        //                return "2nd";
        //            case "JULY":
        //            case "AUGUST":
        //            case "SEPTEMBER":
        //                return "3rd";
        //            case "OCTOBER":
        //            case "NOVEMBER":
        //            case "DECEMBER":
        //                return "4st";
        //        }

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4st";
            // default -> "bad";
            default -> {
                String badResponse = month + " is bad";
                // Sử dụng khôi mã trong biểu thức switch không dùng được return để trả về mà phải dùng yield
                yield badResponse;
            }
        };
    }
}
