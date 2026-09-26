package Rating1200;

import java.util.HashMap;
import java.util.Scanner;

public class SameDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();

                int diff = val - i;

                int seen = map.getOrDefault(diff, 0);

                count += seen;

                map.put(diff, seen + 1);
            }
            System.out.println(count);
        }

        sc.close();
    }
}
