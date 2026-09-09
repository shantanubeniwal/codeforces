package Rating800;

import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, a, b, c;

        t = sc.nextInt();
        while (t > 0)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a == b) {
                System.out.println(c);
            } else {
                if (b == c) {
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }
            }
            t--;
        }
        sc.close();
    }
}
