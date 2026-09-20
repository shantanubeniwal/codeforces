package Rating1000;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int forceX = 0, forceY = 0, forceZ = 0;

        // solution without storing the input vectors
        while (n-- > 0) {
            forceX += sc.nextInt();
            forceY += sc.nextInt();
            forceZ += sc.nextInt();
        }

        // solution with storing the input vectors
        // int[][] vectors = new int[n][3];

        // for (int i = 0; i < n; i++) {
        //     vectors[i][0] = sc.nextInt();
        //     vectors[i][1] = sc.nextInt();
        //     vectors[i][2] = sc.nextInt();
        // }

        // int forceX = 0;
        // int forceY = 0;
        // int forceZ = 0;

        // for (int i = 0; i < n; i++) {
        //     forceX += vectors[i][0];
        //     forceY += vectors[i][1];
        //     forceZ += vectors[i][2];
        // }

        if (forceX == 0 && forceY == 0 && forceZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
