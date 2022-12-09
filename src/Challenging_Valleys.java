import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Challenging_Valleys {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        testcases: while (t-- > 0) {
            int n = in.nextInt();
            ArrayList<Integer> ary = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int e = in.nextInt();
                if(i == 0 || e != ary.get(ary.size()-1)) ary.add(e);
            }
            int countValleys = 0;
            for (int i = 0; i < ary.size(); i++) {
                if((i == 0 || ary.get(i) < ary.get(i-1)) && (i == ary.size()-1 || ary.get(i) < ary.get(i+1))) {
                    if(++countValleys > 1) {
                        out.println("No");
                        out.flush();
                        continue testcases;
                    }
                }
            }
            if(countValleys == 1) out.println("Yes");
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
