package Rating1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XXXXX {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());

        
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());

            int n = Integer.parseInt(tokenizer.nextToken());
            int x = Integer.parseInt(tokenizer.nextToken());

            int[] a = new int[n];
            long sum = 0;
            int left = -1;
            int right = -1;

            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(tokenizer.nextToken());
                sum += a[i];

                if (a[i] % x != 0) {
                    if (left == -1) {
                        left = i;
                    }
                    right = i;
                }
            }

            if (sum % x != 0) {
                System.out.println(n);
            } else if (left == -1) {
                System.out.println(-1);
            } else {
                int dropPrefixLength = n - left - 1;
                int dropSuffixLength = right;

                System.out.println(Math.max(dropPrefixLength, dropSuffixLength));
            }
        }
        
        reader.close();
    }
}
