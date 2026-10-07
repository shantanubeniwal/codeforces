package Rating1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Scuza {
    public static int binarySearch(long[] step, long target) {
        int left = 0;
        int right = step.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (step[mid] <= target) {
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
            int q = Integer.parseInt(tokenizer.nextToken());

            long[] height = new long[n + 1];
            long[] step = new long[n + 1];

            long sum = 0;
            long max = 0;

            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                long ai = Long.parseLong(tokenizer.nextToken());
                max = Math.max(max, ai);
                sum += ai;

                height[i + 1] = sum;
                step[i + 1] = max;
            }

            tokenizer = new StringTokenizer(reader.readLine());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < q; i++) {
                int idx = binarySearch(step, Long.parseLong(tokenizer.nextToken()));
                // if (idx == -1) {
                //     sb.append(0).append(" ");
                // } else {
                //     sb.append(height[idx]).append(" ");
                // }
                sb.append(height[idx]).append(" ");
            }

            System.out.println(sb.toString());
        }
        
        reader.close();
    }
}
