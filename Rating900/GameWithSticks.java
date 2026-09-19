package Rating900;

import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int minSticks = Math.min(n, m);

        if (minSticks % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }

        /*
        if (n == 1 || m == 1) {
            System.out.println("Akshat");
        } else if (n % 2 == 0 && m % 2 == 0) {
            System.out.println("Malvika");
        } else if (n % 2 != 0 && m % 2 != 0) {
            System.out.println("Akshat");
        } else {
            if (n < m) {
                if (n % 2 == 0) {
                    System.out.println("Malvika");
                } else {
                    System.out.println("Akshat");
                }
            } else {
                if (m % 2 == 0) {
                    System.out.println("Malvika");
                } else {
                    System.out.println("Akshat");
                }
            }
        }
        */
        sc.close();
    }
}
