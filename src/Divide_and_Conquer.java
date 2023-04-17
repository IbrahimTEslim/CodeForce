import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Divide_and_Conquer {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int odd = 0, even = 0, minLogEven = Integer.MAX_VALUE, minLogOdd = Integer.MAX_VALUE;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int temp = in.nextInt();
                if(temp % 2 == 0) {
                    even++;
                    if(set.contains(temp)) continue;
//                    minOdd = Math.min(minOdd, ary[i]);
                    int o = 0, tempOdd = temp;

                    set.add(tempOdd);
                    while (tempOdd % 2 != 1) {
                        tempOdd /= 2;
                        o++;
                    }
                    minLogEven = Math.min(minLogEven, o);
                }
                else {
                    odd++;
                    if(set.contains(temp)) continue;
//                    minOdd = Math.min(minOdd, ary[i]);
                    int o = 0, tempOdd = temp;

                    set.add(tempOdd);
                    while (tempOdd % 2 != 0) {
                        tempOdd /= 2;
                        o++;
                    }
                    minLogOdd = Math.min(minLogOdd, o);
                }
            }
            if(odd % 2 == 0) out.println(0);
            else {
                out.println(Math.min(minLogEven,minLogOdd));
            }
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
