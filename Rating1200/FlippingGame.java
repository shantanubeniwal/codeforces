package Rating1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlippingGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        
        int[][] track = new int[n+1][2];
        int zero = 0;
        int one = 0;
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            int curr = Integer.parseInt(tokenizer.nextToken());
            if (curr == 0) {
                zero++;
            } else {
                one++;
            }
            track[i][0] = zero;
            track[i][1] = one;
        }
        
        if (n == 1) {
            if (track[1][0] == 1) {
                System.out.println(1);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }

        int maxOnes = 0;
        int totalOnes = track[n][1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < i)
                    continue;

                int currentOnes = track[j][1] - track[i - 1][1];
                int currentZero = track[j][0] - track[i - 1][0];

                maxOnes = Math.max(maxOnes, totalOnes - currentOnes + currentZero);
            }
        }
        
        System.out.println(maxOnes);
    }
}
