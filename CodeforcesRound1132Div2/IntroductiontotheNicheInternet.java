package CodeforcesRound1132Div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IntroductiontotheNicheInternet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(tokenizer.nextToken());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int k = Integer.parseInt(tokenizer.nextToken());

            tokenizer = new StringTokenizer(reader.readLine());
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(tokenizer.nextToken());
            }

            Arrays.sort(arr);
            int copies = 1;
            int p = n - 2;
            while (p >= 0 && arr[p] == arr[p + 1]) {
                copies++;
                p--;
            }

            if (copies > k) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
                // top k elements in accending order
                for (int i = n - k; i < n; i++) {
                    sb.append(arr[i]).append(" ");
                }

                for (int i = n - k - 1; i >= 0; i--) {
                    sb.append(arr[i]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
