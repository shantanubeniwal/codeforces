package Rating1300;

import java.util.Scanner;

public class BuyingShovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int minPackages = n;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i <= k) {
                        minPackages = Math.min(minPackages, n / i);
                    }

                    if (n / i <= k) {
                        minPackages = Math.min(minPackages, i);
                    }
                }
            }

            sb.append(minPackages).append("\n");
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}
