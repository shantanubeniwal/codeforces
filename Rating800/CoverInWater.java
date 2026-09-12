package Rating800;

import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, n;
        String s;

        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            s = sc.next();

            if (s.contains("..."))
                System.out.println(2);
            else {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '.') {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        
        sc.close();
    }
}
