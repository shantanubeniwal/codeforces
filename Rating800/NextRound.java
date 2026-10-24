package Rating800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        
        tokenizer = new StringTokenizer(reader.readLine());
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int count = 0;
        
        Arrays.sort(scores);
        int targetScore = scores[n - k];
        if (targetScore < 0) {
            System.out.println(0);
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (scores[i] > 0 && scores[i] >= targetScore) {
                count++;
            }
        }
        System.out.println(count);
    }
}
