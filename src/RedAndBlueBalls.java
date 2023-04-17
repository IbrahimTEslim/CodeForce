import java.io.*;
import java.util.*;

public class RedAndBlueBalls {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();

        Set<Integer> redBallBoxes  = new HashSet<>();
        int[] boxes = new int[n];
        Arrays.fill(boxes,1);


        redBallBoxes.add(1);
        for (int i = 0; i < m; i++) {
            int a = in.nextInt(), b = in.nextInt();
            boxes[a-1]--;
            boxes[b-1]++;
            if(redBallBoxes.contains(a)) {
                redBallBoxes.add(b);
                if(boxes[a-1] == 0) redBallBoxes.remove(a);
            }
        }

        out.println(redBallBoxes.size());

        ArrayList<Integer> ary = new ArrayList<>(redBallBoxes);
        Collections.sort(ary);
        for(int e : ary) {
            out.print(e);
            out.print(' ');
        }
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
