package Rating800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class DidNotGoToPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Stack<Integer> s1 = new Stack<>();
            Stack<Integer> s2 = new Stack<>();

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    s1.push(i + 1);
                } else if (ch == '2') {
                    if (!s1.isEmpty()) {
                        s1.pop();
                        s2.push(i + 1);
                    }
                }
            }

            ArrayList<Integer> result = new ArrayList<>();
            while (!s1.isEmpty()) {
                result.add(s1.pop());
            }

            while (!s2.isEmpty()) {
                result.add(s2.pop());
            }

            Collections.sort(result);
            
            System.out.println(result.size());
            StringBuilder sb = new StringBuilder();
            for (int idx : result) {
                sb.append(idx).append(' ');
            }

            System.out.println(sb.toString().trim());
        }
        
        sc.close();
    }
}
