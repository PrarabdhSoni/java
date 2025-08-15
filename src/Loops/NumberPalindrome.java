package Loops;

public class NumberPalindrome {
    // write code here
    public static boolean isPalindrome(int number){

        int reverse = 0;
        int  num = number;
        while(num != 0){
            reverse = (reverse *10) + (num % 10);
            num = num/10;
        }

        return reverse == number;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(323));
        System.out.println(isPalindrome(123));
    }
}
