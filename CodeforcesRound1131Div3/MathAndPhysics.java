package CodeforcesRound1131Div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MathAndPhysics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        while (t-- >0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());

            tokenizer = new StringTokenizer(reader.readLine());
            int[] arr = new int[n];

            long sum = 0;
            boolean interiorBig = false;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(tokenizer.nextToken());
                sum += arr[i];
                if (i > 0 && i < n - 1 && arr[i] > 1) {
                    interiorBig = true;
                }
            }

            if (arr[0] == 1 && arr[n - 1] == 1 && !interiorBig) {
                System.out.println(-1);
            } else if (interiorBig) {
                System.out.println(sum - 1);
            } else {
                System.out.println(arr[0] + arr[n-1] - 1);
            }
        }
    }
}
