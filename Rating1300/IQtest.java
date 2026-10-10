package Rating1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IQtest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[n];
        int zero = 0;

        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
            if (arr[i] % 2 == 0) {
                zero++;
            }
        }

        int target = (zero == 1) ? 0 : 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == target) {
                System.out.println(i + 1);
                break;
            }
        }

        reader.close();
    }
}
