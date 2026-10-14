package Rating1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberOfPairs {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            long l = Long.parseLong(tokenizer.nextToken());
            long r = Long.parseLong(tokenizer.nextToken());

            int[] arr = new int[n];
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }
            Arrays.sort(arr);

            long pairs = 0;
            for (int i = 0; i < n; i++) {
                int maxTarget = (int) (r - arr[i]);
                int minTarget = (int) (l - 1 - arr[i]);

                int j = binarySearch(arr, i + 1, n - 1, maxTarget);
                int k = binarySearch(arr, i + 1, n - 1, minTarget);

                int upperBoundIndex = (j >= i + 1) ? j : i;
                int lowerBoundIndex = (k >= i + 1) ? k : i;

                pairs += (upperBoundIndex - i) - (lowerBoundIndex - i);
            }
            
            System.out.println(pairs);
        }
    }
}
