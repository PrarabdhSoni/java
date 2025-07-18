package Methods;

public class MetricConversions {
    public static double convertToCentimeters(int heightInch){
        return heightInch * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches){
        int totalHeightInches = (heightFeet * 12) + heightInches;
        return convertToCentimeters(totalHeightInches);
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5,8));
        System.out.println(convertToCentimeters(68));
    }
}
