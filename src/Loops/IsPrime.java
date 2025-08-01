package Loops;

public class IsPrime {

    public static void main(String[] args) {

        System.out.println("0 is " + (isPrime(0)? " " : "NOT ") + "a Prime number");
        System.out.println("1 is " + (isPrime(1)? "" : "NOT ") + "a Prime number");
        System.out.println("2 is " + (isPrime(2)? "" : "NOT ") + "a Prime number");
        System.out.println("3 is " + (isPrime(3)? "" : "NOT ") + "a Prime number");
        System.out.println("8 is " + (isPrime(8)? "" : "NOT ") + "a Prime number");
        System.out.println("11 is " + (isPrime(11)? "" : "NOT ") + "a Prime number");

        System.out.println();

        System.out.println("No. of prime numbers in given range");

        System.out.println();

        int count =0;
        for(int i = 10; i<= 50; i++){
            if(isPrime(i)){
                System.out.println("Number " + i + " is a prime number");
                count ++;
            }
        }
        System.out.println("Total number of prime in given range is " + count);
    }

    public static boolean isPrime(int wholeNumber){


        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor <= wholeNumber/2; divisor ++){

            if(wholeNumber % divisor == 0){
                return false;
            }

        }

        return true;
    }
}
