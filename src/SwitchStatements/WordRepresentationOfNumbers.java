package SwitchStatements;

public class WordRepresentationOfNumbers {
        // write code here

        public static void printNumberInWord(int num){

            String numberInWord;

            switch(num){
                case 0 -> numberInWord = "ZERO";
                case 1 -> numberInWord = "ONE";
                case 2 -> numberInWord = "TWO";
                case 3 -> numberInWord = "THREE";
                case 4 -> numberInWord = "FOUR";
                case 5 -> numberInWord = "FIVE";
                case 6 -> numberInWord = "SIX";
                case 7 -> numberInWord = "SEVEN";
                case 8 -> numberInWord = "EIGHT";
                case 9 -> numberInWord = "NINE";
                default -> numberInWord = "OTHER";
            };

            System.out.println(numberInWord);
        }

    public static void main(String[] args) {

            printNumberInWord(2);
            printNumberInWord(0);
            printNumberInWord(100);
    }
}
