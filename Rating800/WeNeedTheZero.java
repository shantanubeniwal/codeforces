package Rating800;

import java.util.Scanner;

public class WeNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, size;

        t = sc.nextInt();
        while (t-- > 0) {
            size = sc.nextInt();
            int xor = 0;

            for (int i = 0; i < size; i++) {
                xor ^= sc.nextInt();
            }

            if (xor == 0) {
                System.out.println(0);
            } else if (size % 2 == 0) {
                System.out.println(-1);
            } else {
                System.out.println(xor);
            }
        }
        sc.close();
    }
}
