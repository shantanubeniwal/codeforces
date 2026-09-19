package Rating1100;

import java.util.Scanner;

public class IlyaAndQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] ip = input.toCharArray();
        int n = ip.length;

        int[] prefix = new int[n + 1];

        for (int i = 1; i < n; i++) {
            prefix[i + 1] = prefix[i];

            if (ip[i - 1] == ip[i]) {
                prefix[i + 1]++;
            }
        }
        
        int m = sc.nextInt();
        while (m-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(prefix[r] - prefix[l]);
        }

        /* 
        int[] arr = new int[ip.length];
        for (int i = 0; i < arr.length - 1; i++) {
            if (ip[i] == ip[i + 1]) {
                arr[i] = 1;
            }
        }

        int m = sc.nextInt();
        while (m-- > 0) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;

            int count = 0;

            while (l < r) {
                count += arr[l];
                l++;
            }

            System.out.println(count);
        }
        */
        sc.close();
    }
}
