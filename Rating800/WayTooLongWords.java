package Rating800;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String ch = sc.nextLine();
            if (ch.length() > 10) {
                char[] arr = ch.toCharArray();
                int l = arr.length;
                sb.append(arr[0]).append(l-2).append(arr[l - 1]);
            } else {
                sb.append(ch);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}