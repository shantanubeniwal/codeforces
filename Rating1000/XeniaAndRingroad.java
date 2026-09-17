package Rating1000;

import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long time = 0;
        int prev = 1;
        while (m-- > 0) {
            int curr = sc.nextInt();
            if (curr == prev) {
                continue;
            } else if (curr > prev) {
                time += (curr - prev);
            } else {
                time += (n - prev + curr);
            }

            prev = curr;
        }
        System.out.println(time);
        sc.close();
    }
}
