import java.io.*;
import java.util.*;

public class Different_Differences {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();

        while (t-- > 0) {
            int k = in.nextInt(), n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            list.add(1);
            set.add(1);
            int step = 1,pointer = 1;
            int pastElement = 1;
            while (list.size() < k && step + pastElement <= n) {
                int temp = step++ + pastElement;
                set.add(temp);
                list.add(temp);
                pastElement = temp;
            }
            int walker = n;
            while (list.size() < k && walker > 2){
                if(set.contains(walker)) walker--;
                else{
                    list.add(walker--);
                }
            }
            Collections.sort(list);
            Iterator it = list.iterator();
            while (it.hasNext())
                out.print(it.next() + " ");
//            for (int i = 0; i < list.size(); i++) {
//                out.print(list.get(i) + " ");
//            }
            out.println();
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
