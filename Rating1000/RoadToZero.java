package Rating1000;

import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long cost1 = (x + y) * a;
            long cost2 = Math.abs(x - y) * a + Math.min(x, y) * b;
            System.out.println(Math.min(cost1, cost2));
        }
        sc.close();
    }
}
