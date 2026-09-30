package Rating1300;

import java.util.Scanner;

public class KthBeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int left = n - 2;
            int right = n - 1;
            while (left >= 0) {
                int ways = n - left - 1;
                if (ways < k) {
                    k -= ways;
                } else {
                    right = n - k;
                    break;
                }
                left--;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i == left || i == right) {
                    sb.append('b');
                } else {
                    sb.append('a');
                }
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}
