package Rating1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortTheArray {
    // helper function to swap the values between i and j index
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr, int left, int right) {
        // left and right index are inclusive
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        int n = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[n];

        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int left = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                left = i - 1;
                break;
            }
        }

        if (left == -1) {
            System.out.println("yes");
            System.out.println(1 + " " + 1);
            return;
        }

        int right = left + 1;
        while (right < n && arr[right] < arr[right - 1]) {
            right++;
        }

        reverseArray(arr, left, right - 1);
        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.println("yes");
            System.out.println(left + 1 + " " + right );
        } else {
            System.out.println("no");
        }
    }
}
