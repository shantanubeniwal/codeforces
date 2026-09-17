package Rating900;

import java.util.Arrays;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] TVs = new int[n];

        for (int i = 0; i < n; i++) {
            TVs[i] = sc.nextInt();
        }

        Arrays.sort(TVs);

        int profit = 0;
        for (int i = 0; i < m; i++) {
            if (TVs[i] > 0) {
                break;
            }
            profit += TVs[i];
        }

        System.out.println(profit * (-1));
        sc.close();
    }
}
