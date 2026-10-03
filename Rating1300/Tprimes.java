package Rating1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tprimes {
    private static final int MAX = 1000000;
    private static boolean[] isPrime = new boolean[MAX + 1];

    public static void seive() {
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= MAX; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= MAX; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        seive();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        reader.close();

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (!tokenizer.hasMoreTokens())
                break;

            long a = Long.parseLong(tokenizer.nextToken());
            long x = (long) Math.sqrt(a);

            if (x * x == a && isPrime[(int) x]) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}
