public class CGD {

    public static void main(String[] args) {

        int n1 = 8, n2 = 12;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 = n2;
            } else {
                n2 = n2 = n1;
            }
        }
        System.out.printf("CGD is " + n2);
    }
}
