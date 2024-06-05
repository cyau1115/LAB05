import java.util.Scanner;

public class JPA504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number :");
        int n = sc.nextInt();
        int sum2 = sum2(n);
        System.out.println("Ans:" + sum2);
    }

    public static int sum2(int m) {
        if (m == 1) {
            return 2;
        }
        else {
            return sum2(m - 1) + 2 * m;
        }
    }
}