import java.util.Scanner;

public class JPA503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input m: ");
            int m = sc.nextInt();
            if (m == 999) {
                break;
            }

            System.out.print("Input n: ");
            int n = sc.nextInt();
            int gcd = gcd(m, n);
            System.out.println("最大公因數: " + gcd);
        }
    }

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
