package ControlStatements;

public class NumberOfDaysInMonth {
        // write code here

        public static boolean isLeapYear(int year){

            if (year >= 1 && year < 9999){

                if (year % 4 == 0){

                    if (year % 100 == 0){

                        return year % 400 == 0;

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

        public static int getDaysInMonth(int month, int year){

            if(month <1 || month >12 || year<1 || year>9999 ){
                return -1;
            }

            boolean isleapYear = isLeapYear(year);



            int days;

            switch(month){
                case 1,3,5,7,8,10,12 -> days = 31;
                case 4,6,9,11 -> days = 30;
                default ->{
                    if(isleapYear){
                        days = 29;
                    }else{
                        days = 28;
                    }
                }
            }

            return days;

        }

    public static void main(String[] args) {
            System.out.println(getDaysInMonth(6,2005));
            System.out.println(getDaysInMonth(8, 1966));
    }
}
