package Rating1100;

import java.util.Arrays;
import java.util.Scanner;

public class SimilarPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int e = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    e++;
                }
            }

            if (e % 2 == 0) {
                System.out.println("YES");
                continue;
            }

            Arrays.sort(arr);
            boolean isfound = false;
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] == 1) {
                    isfound = true;
                    break;
                }
            }

            if (isfound) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
