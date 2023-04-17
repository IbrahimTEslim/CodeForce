import java.io.*;
import java.util.*;

public class AContest2023_01_25 {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        caseloop: while (t-- > 0) {
            int n = in.nextInt();
            HashSet<Integer> odds = new HashSet<>(), evens = new HashSet<>();
            int[] nums = new int[n];
            int pointer = 0;
            for (int i = 0; i < n; i++) {
                nums[pointer++] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int temp = nums[i];
                if (temp % 2 == 0) {
                    evens.add(i + 1);
                } else {
                    odds.add(i + 1);
                }
                if (odds.size() >= 3) {
                    out.println("YES");
                    int counts = 0;
                    for (Integer inte : odds) {
                        out.print(inte + " ");
                        counts++;
                        if(counts==3) break;
                    }
                    out.println("");
                    out.flush();
                    continue caseloop;
                }
                if(odds.size() >= 1 && evens.size()>=2) {
                    out.println("YES");
                    int counts = 0;
                    for (Integer inte : odds) {
                        out.print(inte + " ");
                        counts++;
                        break;
                    }
                    counts = 0;
                    for (Integer inte : evens) {
                        out.print(inte + " ");
                        counts++;
                        if(counts==2) break;
                    }
                    out.println("");
                    out.flush();
                    continue caseloop;
                }
            }
            out.println("NO");
            out.flush();
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String fileName) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(fileName)); // File
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens())
                    str = st.nextToken("\n");
                else
                    str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
