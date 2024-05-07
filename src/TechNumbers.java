public class TechNumbers {

    public static void main(String[] args) {

        for (int i = 1; i <= 9999 ; i++) {

            int p1 = i % 100;
            int p2 = i / 100;
            int sum = p1 + p2;

            if (i == (sum*sum)) {
                System.out.println(i);
            }

        }
    }
}
