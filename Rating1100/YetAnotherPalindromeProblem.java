package Rating1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YetAnotherPalindromeProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(tokenizer.nextToken());

        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int[] arr = new int[n];

            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
            }
            
            boolean isValid = false;
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j > i + 1; j--) {
                    if (arr[i] == arr[j]) {
                        isValid = true;
                    }
                }
            }

            if (isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
