package CodeforcesRound1132Div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A215K4JR3BHardVersion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int[] a = new int[n];

            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(tokenizer.nextToken());
            }

            long b = 0;
            long h = 0;
            Arrays.sort(a);
            for (int i = n - 1; i >= 0; i--) {
                long w = 1 << a[i];
                if (b < h) {
                    b += w;
                } else {
                    h += w;
                }
            }
            sb.append(b * h).append("\n");
        }
        System.out.println(sb);
    }
}
