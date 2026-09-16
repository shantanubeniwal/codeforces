package Rating900;

import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxLen = 0;
        int prev = Integer.MIN_VALUE;
        int len = 0;

        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            if (curr >= prev) {
                len++;
            } else {
                maxLen = Math.max(maxLen, len);
                len = 1;
            }

            maxLen = Math.max(maxLen, len);
            prev = curr;
        }
        
        System.out.println(maxLen);
        sc.close();
    }
}
