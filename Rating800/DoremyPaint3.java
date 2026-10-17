package Rating800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DoremyPaint3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(tokenizer.nextToken());
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            
            tokenizer = new StringTokenizer(reader.readLine());
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int curr = Integer.parseInt(tokenizer.nextToken());
                map.put(curr, map.getOrDefault(curr, 0) + 1);
            }

            if (map.size() > 2) {
                System.out.println("No");
            } else if (map.size() == 1) {
                System.out.println("Yes");
            } else {
                int freq1 = map.values().iterator().next();
                int freq2 = n - freq1;

                if (Math.abs(freq1 - freq2) <= 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
