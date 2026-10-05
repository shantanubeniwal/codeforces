package Rating1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EatingCandies {
    public static int eatCandies(int[] candies, int n) {
        int ans = 0;

        int wa = candies[0];
        int wb = candies[n - 1];

        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (wa == wb) {
                ans = Math.max(ans, left + 1 + n - right);
                if (candies[left + 1] <= candies[right - 1]) {
                    left++;
                    wa += candies[left];
                } else {
                    right--;
                    wb += candies[right];
                }
            } else {
                if (wa < wb) {
                    left++;
                    wa += candies[left];
                } else {
                    right--;
                    wb += candies[right];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            
            int n = Integer.parseInt(tokenizer.nextToken());
            int[] candies = new int[n];
            
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                candies[i] = Integer.parseInt(tokenizer.nextToken());
            }

            System.out.println(eatCandies(candies, n));
        }
    }
}
