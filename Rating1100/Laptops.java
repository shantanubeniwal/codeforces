package Rating1100;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] laptops = new int[n][2];
        for (int i = 0; i < n; i++) {
            laptops[i][0] = sc.nextInt();
            laptops[i][1] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(laptops, Comparator.comparingInt(a -> a[0]));

        int prevPrice = 0;
        for (int[] laptop : laptops) {
            if (laptop[1] < prevPrice) {
                System.out.println("Happy Alex");
                return;
            }
            prevPrice = laptop[1];
        }
        System.out.println("Poor Alex");
    }
}
