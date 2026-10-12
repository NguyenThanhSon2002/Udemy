public class ExCoding25 {

    // Managing Flour Pack Requirements With Limited Bucket Sizes
    static void main(String[] args) {
        System.out.println(canPack(2,7,18));

    }

    //    public static boolean canPack (int bigCount, int smallCount, int goal) {
    //
    //        if (bigCount < 0 || smallCount < 0 || goal < 0) {
    //            return false;
    //        }
    //
    //        int bigBagsUse = goal / 5;
    //
    //        if (bigCount == 0) {
    //            if (smallCount >= goal) {
    //                return  true;
    //            } else  {
    //                return  false;
    //            }
    //        } else {
    //            if (bigCount < bigBagsUse) {
    //                if (bigCount * 5 + smallCount >= goal) {
    //                    return true;
    //                } else  {
    //                    return  false;
    //                }
    //            } else {
    //                if (bigBagsUse * 5 + smallCount >= goal) {
    //                    return true;
    //                } else  {
    //                    return  false;
    //                }
    //            }
    //        }
    //    }

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}
