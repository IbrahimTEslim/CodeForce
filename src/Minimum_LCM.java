import java.util.Scanner;

public class Minimum_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a = 1;
            for (int i = 2; i * i <= n; i++) {
                if(n % i == 0) {
                    a = n / i;
                    break;
                }
            }
            System.out.println(a + " " + (n -a));
        }
    }
}
