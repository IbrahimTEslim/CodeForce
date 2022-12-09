import java.util.Scanner;

public class way_too_long_words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- > 0) {   
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int cnt = 0;
            for (int i = 0; i < n - 2; i++) {
                if (arr[i] == arr[i + 2])
                    cnt++;
            }
            if (arr[n - 1] == arr[0])
                cnt++;
            System.out.println(cnt != 0 ? 1 + arr.length - cnt : arr.length);
        }




        
    }
}
