package Rating1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoldRush {
    public static boolean isPossible(int n, int target) {
        if (n == target)
            return true;

        if (n % 3 != 0)
            return false;

        return isPossible(n/3, target) || isPossible(2 * (n/3), target);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());

            if (isPossible(n, m)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        reader.close();
    }
}
