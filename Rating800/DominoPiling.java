package Rating800;

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int maxDomino = (m / 2) * n + (m % 2) * (n / 2);
        System.out.println(maxDomino);
    }
}
