package Rating1000;

import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int count = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                count++;
            }

            n /= 2;
        }

        System.out.println(count);
        sc.close();
    }
}
