package Rating800;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr;

        n = sc.nextInt();
        arr = new int[n];
        int totalSum = 0;

        // store the upcoming array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        // sort it
        Arrays.sort(arr);

        int mySum = 0;
        int coinCount = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            mySum += arr[i];
            coinCount++;

            if (mySum > totalSum / 2) {
                System.out.println(coinCount);
                break;
            }
        }
        sc.close();
    }
}
