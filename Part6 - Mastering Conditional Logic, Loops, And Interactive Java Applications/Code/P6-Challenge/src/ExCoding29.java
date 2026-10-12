public class ExCoding29 {

    // Efficient Paint Job Planning With Bucket Calculations
    static void main(String[] args) {

        System.out.println(getBucketCount(1.4,2.1,1.5,-4));

    }

    //    public static int getBucketCount (double widthOfTheWall, double heightOfTheWall, double areaPerBucket, int extraBucket){
    //        if (widthOfTheWall <= 0 || heightOfTheWall <= 0 || areaPerBucket <= 0 || extraBucket < 0){
    //            return -1;
    //        }
    //        return (int) Math.ceil((widthOfTheWall * heightOfTheWall) / areaPerBucket) - extraBucket;
    //    }
    //
    //    public static int getBucketCount (double width, double height, double areaPerBucket){
    //        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
    //            return -1;
    //        }
    //        return (int) Math.ceil((width * height) / areaPerBucket);
    //    }
    //
    //    public static int getBucketCount (double are, double areaPerBucket){
    //        if (are <= 0 || areaPerBucket <= 0){
    //            return -1;
    //        }
    //        return (int) Math.ceil(are / areaPerBucket);
    //    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double remainingArea = area - extraBuckets * areaPerBucket;
        return getBucketCount(remainingArea, areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 ||areaPerBucket <= 0 ) {
            return -1;
        }

        double area = width * height;
        return getBucketCount(area, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double numberOfBuckets = area / areaPerBucket;
        return (int) Math.ceil(numberOfBuckets);
    }
}
