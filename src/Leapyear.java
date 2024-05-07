public class Leapyear {

    public static void main(String[] args) {

        int number = 2020;

        if ((number % 4 ==0) && (number % 100 != 0) || (number % 400 == 0) ) {
            System.out.println("Leap year");
        } else {
            System.out.println("Common year");
        }
    }
}
