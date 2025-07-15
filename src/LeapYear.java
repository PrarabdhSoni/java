public class LeapYear {
        public static boolean isLeapYear(int year){
            if (year >= 1 && year < 9999){

                if (year % 4 == 0){

                    if (year % 100 == 0){

                        if (year % 400 == 0){
                            return true;
                        }else{
                            return false;
                        }

                    }else{
                        return true;
                    }
                }else{
                    return false;
                }

            }else{
                return false;
            }
        }

        public static void main(String[] args){
            boolean leapYear = isLeapYear(1600);
            System.out.println(leapYear);
            leapYear = isLeapYear(2017);
            System.out.println(leapYear);
            leapYear = isLeapYear(-1600);
            System.out.println(leapYear);
        }

}
