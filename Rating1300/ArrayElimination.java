package Rating1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayElimination {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int[] count = new int[32];
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                int curr = Integer.parseInt(tokenizer.nextToken());
                for (int b = 0; b < 32; b++) {
                    if ((curr & (1 << b)) != 0) {
                        count[b]++;
                    }
                }
            }

            int gcd = 0;
            for (int i = 0; i < 32; i++) {
                if (count[i] == 0) {
                    continue;
                }
                gcd = gcd(gcd, count[i]);
            }

            if (gcd == 0) {
                for (int i = 1; i <= n; i++) {
                    sb.append(i).append(" ");
                }
            } else {
                for (int i = 1; i <= n && i <= gcd; i++) {
                    if (gcd % i == 0) {
                        sb.append(i).append(" ");
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
