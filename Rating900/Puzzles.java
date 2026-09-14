package Rating900;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int A = arr[n - 1];
        int B = arr[0];

        int i = 0;
        int j = n - 1;

        for (; j < m; j++) {
            if (arr[j] - arr[i] < A - B) {
                A = arr[j];
                B = arr[i];
            }
            i++;
        }
        
        System.out.println(A - B);
        sc.close();
    }
}
