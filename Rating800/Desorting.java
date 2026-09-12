package Rating800;

import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, n;

        t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();
            int smallestDifference = Integer.MAX_VALUE;
            int prev = sc.nextInt();
            boolean isSorted = true;

            for (int i = 1; i < n; i++) {
                int curr = sc.nextInt();

                if (curr < prev) {
                    isSorted = false;
                }

                smallestDifference = Math.min(smallestDifference, curr - prev);

                prev = curr;
            }
            if (!isSorted) {
                System.out.println(0);
            } else {
                System.out.println((smallestDifference / 2) + 1);
            }
        }

        sc.close();
    }
}
