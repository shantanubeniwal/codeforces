package Rating1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class SortedAdjacentDifferences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int[] arr = new int[n];

            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }

            Arrays.sort(arr);

            ArrayList<Integer> res = new ArrayList<>();
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                res.add(arr[right]);
                right--;
                if (left <= right) {
                    res.add(arr[left]);
                    left++;
                }
            }

            Collections.reverse(res);

            for (int val : res) {
                sb.append(val).append(" ");
            }

            sb.append("\n");
        }
        
        System.out.print(sb.toString());
        reader.close();
    }
}
