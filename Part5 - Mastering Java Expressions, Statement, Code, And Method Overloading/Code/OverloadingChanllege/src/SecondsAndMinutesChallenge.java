public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,46));
        System.out.println(getDurationString(-3945 ));
    }

    //    public static String getDurationString(int seconds) {
    //        int minutes = seconds / 60;
    //        int seconds2 = seconds % 60;
    //        return getDurationString(minutes, seconds2);
    //    }
    //
    //    public static String getDurationString(int minutes, int seconds) {
    //        int hours = (seconds / 3600) + (minutes / 60);
    //        int minutes2 = (seconds % 3600) / 60 + minutes % 60;
    //        hours += minutes2 / 60;
    //        int minutes3 = minutes2 % 60;
    //        int seconds2 = (seconds % 3600) % 60;
    //        return hours + "h" + minutes3 + "m" + seconds2 + "s";
    //    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return  "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return  "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";
    }

}
