import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit number");
        int number = sc.nextInt();
        System.out.println("Armstrong numbers up to" + number + " are :" );
        for (int i = 0; i <= number; i++) {

            if (IsArmStrong(i)) {
                System.out.println(i + " , ");
            }
            
        }
    }

    public static boolean IsArmStrong(int n) {
        int temp, digits=0, last=0, sum=0;

        temp = n;

        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = n;
        while (temp > 0) {

            last = temp % 10;

            sum += Math.pow(last, digits);

            temp = temp / 10;
            }

        if (n == sum) {
            return true;

        } else {
            return false;
        }
    }
}
