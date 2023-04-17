import java.io.*;
import java.util.*;

public class KitchenPlates {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        char[] ary = {'E','D', 'C', 'B', 'A'};
        char[][] rules = new char[5][2];
        int[] indexes = new int[5];
        int pointer = 0;
        for (int i = 4; i >= 0; i--) indexes[pointer++] = i;


        for (int i = 0; i < 5; i++) {
            String tmp = in.next();
            char l = tmp.charAt(0), s = tmp.charAt(2);
            if(tmp.charAt(1) == '<'){
                l = tmp.charAt(2);
                s = tmp.charAt(0);
            }
            rules[i][0] = l;
            rules[i][1] = s;
        }

        int counter = 0;
        for (int i = 0; i < 5; i++) {
            if(counter >= 121) {
                out.println("impossible");
                out.flush();
                return;
            }
            char[] tmp = rules[i];
            if(indexes[tmp[0] - 'A'] < indexes[tmp[1] - 'A']) {

                char tmpCh = ary[indexes[tmp[0] - 'A']];
                ary[indexes[tmp[0] - 'A']] = ary[indexes[tmp[1] - 'A']];
                ary[indexes[tmp[1] - 'A']] = tmpCh;

                int tmpI = indexes[tmp[0] - 'A'];
                indexes[tmp[0] - 'A'] = indexes[tmp[1] - 'A'];
                indexes[tmp[1] - 'A'] = tmpI;

                counter++;

                i = -1;
            }
        }
        out.println(String.valueOf(ary));
        out.flush();
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
