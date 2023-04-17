import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Absolute_Sorting {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] ary = new int[n];
            for (int i = 0; i < n; i++) {
                ary[i] = in.nextInt();
            }
            int mn = 0, mx = (int) 1e9;
            for (int i = 0; i + 1 < n; i++) {
                int x = ary[i], y = ary[i+1];
                int midL = (x+y) / 2, midR = (x+y+1)/2;
                if(x<y) mx = Math.min(mx,midL);
                if(x>y) mn = Math.max(mn,midR);
            }
            if(mn <= mx) out.println(mn);
            else out.println(-1);
            out.flush();
        }
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
