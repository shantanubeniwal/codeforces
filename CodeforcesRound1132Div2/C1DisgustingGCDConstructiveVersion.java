package CodeforcesRound1132Div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C1DisgustingGCDConstructiveVersion {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            return n == 2;
        }
        for (int d = 3; (long) d * d <= n; d += 2) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(tokenizer.nextToken());
        
        int[] cached = new int[100_001];
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());

            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(tokenizer.nextToken());
                if (cached[a] == 0) {
                    int p = a;
                    while (!isPrime(p)) {
                        p++;
                    }
                    cached[a] = p;
                }
                sb.append(cached[a]).append(' ');
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
