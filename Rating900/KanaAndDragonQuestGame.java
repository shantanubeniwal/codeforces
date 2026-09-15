package Rating900;

import java.util.Scanner;

public class KanaAndDragonQuestGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int x, n, m;
        while (t-- > 0) {
            x = sc.nextInt();
            n = sc.nextInt(); // void x/2 + 10
            m = sc.nextInt(); // light x - 10

            while (x > 20 && n > 0) {
                x = (x / 2) + 10;
                n--;
            }

            while (x > 0 && m > 0) {
                x -= 10;
                m--;
            }

            if (x > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
