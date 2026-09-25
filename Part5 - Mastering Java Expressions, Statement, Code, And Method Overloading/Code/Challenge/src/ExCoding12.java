public class ExCoding12 {

    static void main(String[] args) {

    }

    //    public static boolean isCatPlaying (boolean summer, int temperature) {
    //        if (summer == true && (temperature >= 25 && temperature <= 45)) {
    //            return true;
    //        } else if ((summer == false && (temperature >= 25 && temperature <= 35))) {
    //            return true;
    //        }
    //
    //        return false;
    //    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}
