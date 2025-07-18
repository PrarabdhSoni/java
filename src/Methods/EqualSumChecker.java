package Methods;

public class EqualSumChecker {

        public static boolean hasEqualSum(int num1, int num2, int num3){
            if(num1 + num2 == num3){
                return true;
            }else if (num1 + num3 == num2){
                return true;
            }else if(num2 + num3 == num1){
                return true;
            }else{
                return false;
            }
        }

        public static void main(String[] args){
            System.out.println(hasEqualSum(1, 1, 2));
        }
}
