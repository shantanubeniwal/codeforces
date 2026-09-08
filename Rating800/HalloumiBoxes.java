package Rating800;

import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        // sort boxed in non-decreasing order
        // It can only reverse any subarray† of boxes with length at most k.

        // The first line contains a single integer t (1≤t≤100) — the number of test cases
        // Each test case consists of two lines
        // The first line of each test case contains two integers n and k (1 ≤ k ≤ n ≤ 100) 
        // if able to sort print YES or NO 

        // test = number of tests, n is number of boxes, k lenght of subarray that we may reverse, boxes is the array of boxes
        int test, n, k;
        int[] boxes;

        Scanner sc = new Scanner(System.in);

        test = sc.nextInt();

        // loop over test cases
        for (int i = 0; i < test; i++)
        {
            n = sc.nextInt();
            k = sc.nextInt();
            boxes = new int[n];

            // fill boxes array
            for (int j = 0; j < n; j++)
            {
                boxes[j] = sc.nextInt();
            }

            if (k < 2) {
                // check array is already sorted or not
                boolean isAnswered = false;
                for (int p = 0; p < n - 1; p++)
                {
                    if (boxes[p + 1] < boxes[p]) {
                        isAnswered = true;
                        System.out.println("NO");
                        break;
                    }
                }
                
                if (!isAnswered)
                {
                    System.out.println("YES");
                }
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
