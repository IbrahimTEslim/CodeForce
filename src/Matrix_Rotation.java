import java.io.*;
import java.util.*;

public class Matrix_Rotation {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        while (t-- > 0) {
            int[][] ary  = new int[2][2];
            ary[0][0] = in.nextInt();
            ary[0][1] = in.nextInt();
            ary[1][0] = in.nextInt();
            ary[1][1] = in.nextInt();
            boolean beautiful = false;
            for (int i = 0; i < 4; i++) {
                if(!isBeautiful(ary)) rotate(ary);
                else {
                    beautiful = true;
                    break;
                }
            }
            if(beautiful) out.println("YES");
            else out.println("NO");
            out.flush();
        }
    }
    static void rotate(int[][] ary) {
        int temp = ary[0][0];
        ary[0][0] = ary[1][0];
        ary[1][0] = ary[1][1];
        ary[1][1] = ary[0][1];
        ary[0][1] = temp;
    }
    static boolean isBeautiful(int[][] ary) {
        return ary[0][0] < ary[0][1] && ary[1][0] < ary[1][1] && ary[0][0] < ary[1][0] && ary[0][1] < ary[1][1];
    }
    static  class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String fileName) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(fileName)); // File
        }
        String next(){
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens())
                    str = st.nextToken("\n");
                else
                    str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
