package Rating900;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // highly optimised solution
        long n = sc.nextLong();
        long k = sc.nextLong();

        long oddsCount = (n + 1) / 2;

        if (k <= oddsCount) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - oddsCount));
        }

        /*
        long n, k;
        n = sc.nextLong();
        k = sc.nextLong();

        if (n % 2 == 0) {
            if (k <= n / 2) {
                // kth odd
                System.out.println(2*k - 1);
            } else {
                // k -= n /2 th even
                k -= n / 2;
                System.out.println(2*k);
            }
        } else {
            if (k <= (n / 2 + 1)) {
                // kth odd
                System.out.println(2 * k - 1);
            } else {
                // k -= (n/2 + 1) th even
                k -= (n / 2 + 1);
                System.out.println(2 * k);
            }
        }
        */
        sc.close();
    }
}
