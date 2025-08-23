package Loops;

public class EvenDigitsSum {

        public static int getEvenDigitSum(int number){
            if(number <0){
                return -1;
            }

            int total = 0;
            int num = number;
            while(num > 0){

                int reminder = num %10;

                if(reminder %2 == 0){
                    total += reminder;
                }

                num = num/10;
            }

            return total;
        }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(243195782));
    }
}
