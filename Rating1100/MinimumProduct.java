package Rating1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimumProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());

        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            long a = Long.parseLong(tokenizer.nextToken());
            long b = Long.parseLong(tokenizer.nextToken());
            long x = Long.parseLong(tokenizer.nextToken());
            long y = Long.parseLong(tokenizer.nextToken());
            long n = Long.parseLong(tokenizer.nextToken());

            long opt1 = getProduct(a, b, x, y, n);
            long opt2 = getProduct(b, a, y, x, n);

            System.out.println(Math.min(opt1, opt2));
        }

        reader.close();
    }
    
    public static long getProduct(long primary, long secondary, long minPrimary, long minSecondary, long n) {
        long decPrimary = Math.min(n, primary - minPrimary);
        primary -= decPrimary;
        n -= decPrimary;

        long decSecondary = Math.min(n, secondary - minSecondary);
        secondary -= decSecondary;

        return primary * secondary;
    }
}
