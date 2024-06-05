import java.util.Scanner;

public class JPA502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Input n (0 <= n <= 16): ");
            int n = sc.nextInt();
            if (n == 999) {
                break;
            }
            
            int fac = fac(n);
            int facTail = facTail(n ,1);
            System.out.println(n + "的階乘(迴圈) = " + fac);
            System.out.println(n + "的階乘(尾遞迴) = " + facTail);
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

    public static int facTail(int a, int b) {
        if (a == 1) {
            return b;
        }
        else {
            return facTail(a - 1, a * b);
        }
    }
}