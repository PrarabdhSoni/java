package Methods;

public class PlayingCat {
    /*
    Problem Statement:-
     The cats spend most of the day playing.
     In particular, they play if the temperature is between 25 and 35 (inclusive).
     Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
    */
    public static boolean isCatPlaying(boolean summer, int temperature){

        int maxTemp = summer ? 45 : 35;

        if (temperature<25){
            return false;
        }

        if (temperature >maxTemp){
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}