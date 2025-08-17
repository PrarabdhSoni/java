package Loops;

public class FirstAndLastDigitSum {

        public static int sumFirstAndLastDigit(int number){

            if(number <0){
                return -1;
            }

            int lastDigit = number % 10;

            int firstDigit = number;

            while(firstDigit >= 10){
                firstDigit /= 10;
            }

            return firstDigit + lastDigit;
        }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(101));
        System.out.println(sumFirstAndLastDigit(543));
        System.out.println(sumFirstAndLastDigit(567646));
        System.out.println(sumFirstAndLastDigit(-172));
        System.out.println(sumFirstAndLastDigit(7));
    }
}
