package Rating1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinRows {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(tokenizer.nextToken());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int m = Integer.parseInt(tokenizer.nextToken());

            int[][] matrix = new int[2][m];
            for (int i = 0; i < 2; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(tokenizer.nextToken());
                }
            }

            int[] suffix = new int[m];
            int[] prefix = new int[m];

            int sum = 0;
            for (int i = m - 1; i >= 0; i--) {
                sum += matrix[0][i];
                suffix[i] = sum;
            }
            sum = 0;
            for (int i = 0; i < m; i++) {
                sum += matrix[1][i];
                prefix[i] = sum;
            }
            
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < m; i++) {
                int upperPath = (i + 1 < m) ? suffix[i + 1] : 0;
                int lowerPath = (i - 1 >= 0) ? prefix[i - 1] : 0;

                ans = Math.min(ans, Math.max(upperPath, lowerPath));
            }

            sb.append(ans).append('\n');
        }
        
        System.out.println(sb.toString());
    }
}
