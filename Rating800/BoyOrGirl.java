package Rating800;

import java.util.Arrays;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_name = sc.nextLine();

        int[] count = new int[26];
        Arrays.fill(count, -1);

        // odd male even female

        char[] user = user_name.toCharArray();

        for (char c : user)
        {
            count[c - 'a']++;
        }

        int distinctCount = 0;
        for (int n : count)
        {
            if (n >= 0)
                distinctCount++;
        }

        if (distinctCount % 2 == 0)
        {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
