package Loops;

public class EvenRange {

    public static boolean isEvenNumber(int number){
        return number %2 ==0;
    }
    public static void main(String[] args) {
        int start =4;
        int finished =20;
        int evenCount =0;
        int oddCount =0;

        while(start <= finished){
            start ++;
            if(!isEvenNumber(start)){
                oddCount++;
                continue;
            }
            System.out.println(start);
            evenCount++;
            if(evenCount >= 5){
                break;
            }
        }
        System.out.println("The total numbers of even number is "+ evenCount);
        System.out.println("The total numbers of odd number is "+ oddCount);
    }
}
