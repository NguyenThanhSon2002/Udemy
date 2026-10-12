public class ConvertToCentimeters {

    public static void main(String[] args) {

        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int heightInInches) {
           return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        int result = heightInFeet * 12 + heightInInches;
        return convertToCentimeters(result);
    }


}
