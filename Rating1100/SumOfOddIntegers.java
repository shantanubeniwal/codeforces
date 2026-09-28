package Rating1100;

import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n % 2 == k % 2 && n >= k * k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            // if((n % 2 == 0 && k % 2 == 0) || (n % 2 != 0 && k % 2 != 0)){
            //     long k2 = k * k;
            //     if (n < k2) {
            //         System.out.println("NO");
            //     } else {
            //         System.out.println("YES");
            //     }
            // } else {
            //     System.out.println("NO");
            // }
        }
        sc.close();
    }
}
