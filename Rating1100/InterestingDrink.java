package Rating1100;

import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);

        int q = sc.nextInt();
        long[] m = new long[q];
        
        for (int i = 0; i < q; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            long mi = m[i];
            // find mi or less then mi in x array
            int left = 0;
            int right = n - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (x[mid] <= mi) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(left);
        }
        sc.close();
    }
}
