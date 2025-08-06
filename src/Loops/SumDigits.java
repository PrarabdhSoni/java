package Loops;

public class SumDigits {

    public static void main(String[] args) {
        System.out.println("THe sum of the digits of number 1234 is " + sumDigits(1234));
        System.out.println("THe sum of the digits of number -34 is " + sumDigits(-34));
        System.out.println("THe sum of the digits of number 4 is " + sumDigits(4));
        System.out.println("THe sum of the digits of number 5674 is " + sumDigits(5674));
    }

    public static int sumDigits(int number){

        if(number <0){
            return -1;
        }

        int sum =0;

        while(number > 9){
            sum += (number%10);
            number = number/10;
        }

        sum += number;

        return sum;
    }
}
