package Rating1100;

import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int[] prefix = new int[n + 1];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += h[i - 1];
            prefix[i] = sum;
        }

        int minSum = Integer.MAX_VALUE;
        int resultIndex = 0;
        int right = k - 1;
        for (int j = 0; j < (n - k + 1); j++) {
            int currentSum = prefix[right + 1] - prefix[j];
            if (currentSum < minSum) {
                minSum = currentSum;
                resultIndex = j;
            }
            right++;
        }

        System.out.println(resultIndex + 1);
        sc.close();
    }
}
