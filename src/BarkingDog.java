public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(!barking){
            return false;
        }else if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        boolean wakeUp = shouldWakeUp(true, 6);
        System.out.println("Alarm ring = " + wakeUp);

    }
}
