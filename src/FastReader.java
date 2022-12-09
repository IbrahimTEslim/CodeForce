import java.io.*;
import java.util.StringTokenizer;

class FastReader {
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
} // end fast reader