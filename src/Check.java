import java.util.Scanner;

public class Check {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number > 0 ) {
            System.out.println("it is a positive number");
        } else if (number < 0){
            System.out.println("it is a negative number");
        } else {
            System.out.println("it is zero");
        }
    }
}
