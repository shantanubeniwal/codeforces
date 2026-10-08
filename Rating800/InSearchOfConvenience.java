package Rating800;

import java.util.Scanner;

public class InSearchOfConvenience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int R = sc.nextInt();

            int x = x0 + R;
            int y = y0;

            System.out.println(x + " " + y);
        }

        sc.close();
    }
}
