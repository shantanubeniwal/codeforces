package Rating1200;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // String[] stringInputs = reader.readLine().split(" ");

        int[] laterns = new int[n];
        for (int i = 0; i < n; i++) {
            // laterns[i] = Integer.parseInt(stringInputs[i]);
            laterns[i] = sc.nextInt();
        }

        Arrays.sort(laterns);

        double maxDiff = Math.max((laterns[0] - 0), (l - laterns[n - 1]));
        for (int i = 1; i < n; i++) {
            double diff = ((double) (laterns[i] - laterns[i - 1])) / 2;
            maxDiff = Math.max(maxDiff, diff);
        }

        System.out.println(maxDiff);
        sc.close();
        // reader.close();
    }
}
