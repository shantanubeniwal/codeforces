package Rating800;

import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t, n, x;
        
        t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();
            x = sc.nextInt();
            int maxGap = 0;
            int prevStation = 0;

            for (int i = 0; i < n; i++) {
                int currentStation = sc.nextInt();

                maxGap = Math.max(maxGap, currentStation - prevStation);

                prevStation = currentStation;
            }

            // check for the last station 
            maxGap = Math.max(maxGap, 2 * (x - prevStation));

            System.out.println(maxGap);
        }

        sc.close();
    }
}
