package Rating1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChallengingCliffs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int[] height = new int[n];

            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                height[i] = Integer.parseInt(tokenizer.nextToken());
            }

            Arrays.sort(height);
            int minDiff = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 1; i < n; i++) {
                int diff = height[i] - height[i - 1];
                if (diff < minDiff) {
                    minDiff = diff;
                    index = i;
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append(height[index - 1]).append(" ");
            for (int i = index + 1; i < n; i++) {
                sb.append(height[i]).append(" ");
            }
            for (int i = 0; i < index - 1; i++) {
                sb.append(height[i]).append(" ");
            }
            sb.append(height[index]);

            System.out.println(sb.toString().trim());
        }
    }
}
