package Rating1000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int strength = sc.nextInt();
        int n = sc.nextInt();

        int[][] dragons = new int[n][2];

        for (int i = 0; i < n; i++) {
            dragons[i][0] = sc.nextInt();
            dragons[i][1] = sc.nextInt();
        }

        Arrays.sort(dragons, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n; i++) {
            if (strength > dragons[i][0]) {
                strength += dragons[i][1];
            } else {
                System.out.println("NO");
                sc.close();
                return;
            }
        }

        System.out.println("YES");
        sc.close();
    }
}
