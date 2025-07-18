package Methods;

public class Integer {
    public static void checkNumber(int number) {
        System.out.println(number > 0 ? "positive" : (number == 0 ? "zero" : "negative"));
    }

    public static void main(String[] args) {
        checkNumber(20);
        checkNumber(0);
        checkNumber(-20);
    }
}
