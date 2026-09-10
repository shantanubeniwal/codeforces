package Rating800;

import java.util.Scanner;

public class ToMyCritics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t, a, b, c;
        t = sc.nextInt();

        while (t-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a + b >= 10 || b + c >= 10 || c + a >= 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
