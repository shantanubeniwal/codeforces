package Rating800;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int groups = 1;
        while (n-- > 1) {
            int curr = sc.nextInt();
            if (prev != curr) {
                groups++;
            }
            prev = curr;
        }
        System.out.println(groups);
    }
}
