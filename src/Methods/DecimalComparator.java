package Methods;

public class DecimalComparator {
        public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
            //  String temp = String.format("%.3f",num1);
            //  double n1 = Double.parseDouble(temp);

            //  String temp2 = String.format("%.3f",num2);
            //  double n2 = Double.parseDouble(temp2);
            //  return n1==n2;

            long roundNum1 = (long) (num1 * 1000);
            long roundNum2 = (long) (num2 * 1000);

            return roundNum1 == roundNum2;
        }

        public static void main(String[] args){
            System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
            System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        }


}
