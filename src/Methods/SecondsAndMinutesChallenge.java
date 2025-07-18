package Methods;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds){

        if (seconds < 0) {
            return "Invalid Seconds" + seconds;
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){

        if(minutes <0 ){
            return "Invalid Minutes" + minutes;
        }

        if (seconds <0 || seconds >59){
            return "Invalid data for seconds";
        }

        int hour = minutes /60;
        int remainingMinutes = minutes % 60;

        return hour +"h " + remainingMinutes + "m " + seconds + "s ";
    }
}
