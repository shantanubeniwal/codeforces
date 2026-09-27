package Rating1000;

import java.util.Scanner;

public class BoardMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = (n - 1) / 2;
            long count = (k * (k + 1) * (2 * k + 1) * 8) / 6;

            System.out.println(count);
        }
        sc.close();
    }
}
