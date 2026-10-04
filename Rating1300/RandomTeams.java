package Rating1300;

import java.util.Scanner;

public class RandomTeams {
    public static long nc2(long n) {
        if (n == 1)
            return 0;

        return (n) * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        sc.close();

        long r = n % m;
        long k = n / m;

        long min = r * nc2(k + 1) + (m - r) * nc2(k);
        long max = nc2(n - m + 1);

        System.out.println(min + " " + max);
    }
}
