public class ExCoding3 {

    //Accurate MegaBytes Converter For Mastering Integer Math In Java
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    //    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
    //        if (kiloBytes < 0) {
    //            System.out.println("Invalid Value");
    //        } else {
    //            int megabytes = kiloBytes / 1024;
    //            int remainingKilobytes = kiloBytes % 1024;
    //            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
    //        }
    //    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int mb = kiloBytes / 1024;
        int remainingKB = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainingKB + " KB");
    }
}
