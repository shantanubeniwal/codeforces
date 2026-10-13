package Rating1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ZeroRemainderArray {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int n = Integer.parseInt(tokenizer.nextToken());
            long k = Long.parseLong(tokenizer.nextToken());
            tokenizer = new StringTokenizer(reader.readLine());

            HashMap<Long, Long> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long a = Long.parseLong(tokenizer.nextToken());
                long r = a % k;
                if (r == 0) {
                    continue;
                }
                long need = k - r;
                freq.merge(need, 1L, (oldValue, newValue) -> oldValue + newValue);
            }

            long ans = 0;
            for (HashMap.Entry<Long, Long> e : freq.entrySet()) {
                long need = e.getKey();
                long cnt = e.getValue();
                ans = Math.max(ans, need + (cnt - 1) * k + 1);
            }
            
            System.out.println(ans);
        }
    }
}
