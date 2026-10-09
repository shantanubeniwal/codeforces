package Rating1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AssemblyViaMinimums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = n * (n - 1) / 2;
            int[] b = new int[m];
            
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(tokenizer.nextToken());
            }

            Arrays.sort(b);

            int idx = 0;
            for (int i = 0; i < n - 1; i++) {
                idx += (n - 1 - i);
                sb.append(b[idx - 1]).append(" ");
            }
            sb.append(b[m - 1]).append("\n");
        }
        System.out.print(sb.toString());
    }
}
