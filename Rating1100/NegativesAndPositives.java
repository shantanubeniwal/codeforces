package Rating1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NegativesAndPositives {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());

        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            
            int n = Integer.parseInt(tokenizer.nextToken());
            long[] arr = new long[n];
            long sum = 0;

            // you can optimise this code by do not storing the input array just find the sum and use it further
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(tokenizer.nextToken());
                sum += Math.abs(arr[i]);
            }

            long smallest = Long.MAX_VALUE;
            int negativeCount = 0;
            for (long num : arr) {
                if (num < 0) {
                    negativeCount++;
                }
                smallest = Math.min(Math.abs(num), smallest);
            }

            if (negativeCount % 2 == 0) {
                System.out.println(sum);
            } else {
                System.out.println(sum - 2 * smallest);
            }
            
        }
    }
}
