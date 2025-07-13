public class MethodChallenge {
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >=100) {
            return 3;
        }
        return 4;
    }

    public static void main(String[] args) {
        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Prarabdh", score);
        score = calculateHighScorePosition(1000);
        displayHighScorePosition("Prarabdh", score);
        score = calculateHighScorePosition(500);
        displayHighScorePosition("Prarabdh", score);
        score = calculateHighScorePosition(100);
        displayHighScorePosition("Prarabdh", score);
        score = calculateHighScorePosition(25);
        displayHighScorePosition("Prarabdh", score);
    }
}