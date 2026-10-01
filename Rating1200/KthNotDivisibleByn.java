package Rating1200;

import java.util.Scanner;

public class KthNotDivisibleByn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            // long i = 1;
            // while (k > 0) {
            //     if (i % n != 0) {
            //         k--;
            //     }
            //     i++;
            // }
            // System.out.println(i-1);

            long ans = k + (k-1)/(n-1);
            System.out.println(ans);
        }
        sc.close();
    }
}
