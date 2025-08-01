package Methods;

public class SpeedConvertor {

        public static long toMilesPerHour(double kilometersPerHour){
            if(kilometersPerHour < 0){
                return -1;
            }else{
                return Math.round(kilometersPerHour/1.609);
            }
        }

        public static void printConversion(double kilometersPerHour){

            long miles = toMilesPerHour(kilometersPerHour);

            if (miles == -1){
                System.out.println("Invalid Value");
            }else{
                System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
            }

        }
    public static void main(String[] args){
            printConversion(1.5);
        printConversion(10.5);
    }
}
