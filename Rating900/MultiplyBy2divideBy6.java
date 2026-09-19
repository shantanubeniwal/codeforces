package Rating900;

import java.util.Scanner;

public class MultiplyBy2divideBy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int count = 0;

            while (n > 0) {
                if (n == 1) {
                    System.out.println(count);
                    break;
                }

                if (n % 3 != 0) {
                    System.out.println(-1);
                    break;
                }

                if (n % 2 != 0) {
                    n *= 2;
                    count++;
                } else {
                    n /= 6;
                    count++;
                }
            }
        }
        sc.close();
    }
}
