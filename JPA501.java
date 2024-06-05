import java.util.Scanner;

public class JPA501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input n (0 <= n <= 16): ");
            int n = sc.nextInt();
            if (n == 999) {
                break;
            }

            int fac = fac(n);
            System.out.println(n + "的階乘 = " + fac);
        }
    }

    public static int fac(int i) {
        if (i == 0) {
            return 1;
        }
        else {
            return i * fac(i - 1);
        }
    }
}