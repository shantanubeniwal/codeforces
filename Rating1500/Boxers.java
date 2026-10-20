package Rating1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Boxers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        int[] boxers = new int[n];
        for (int i = 0; i < n; i++) {
            boxers[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(boxers);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = boxers[i];
            if (x - 1 > 0 && !set.contains(x - 1)) {
                set.add(x - 1);
            } else if (!set.contains(x)) {
                set.add(x);
            } else if (!set.contains(x + 1)) {
                set.add(x + 1);
            }
        }
        
        System.out.println(set.size());
    }
}
