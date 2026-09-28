package Rating1100;

import java.util.Scanner;

public class TwoTeamsComposing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] count = new int[n + 1];
            
            int maxFreq = 0;
            int uniqueCount = 0;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (count[val] == 0) {
                    uniqueCount++;
                }
                count[val]++;
                maxFreq = Math.max(maxFreq, count[val]);
            }

            int ans = Math.max(Math.min(maxFreq, uniqueCount - 1), Math.min(maxFreq - 1, uniqueCount));
            System.out.println(ans);
        }
        sc.close();
    }
}
