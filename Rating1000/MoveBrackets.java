package Rating1000;

import java.util.Scanner;
import java.util.Stack;

public class MoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Character> stack = new Stack<>();
            int n = sc.nextInt();
            String s = sc.next();

            for (int i = 0; i < n; i++) {
                char curr = s.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(curr);
                } else {
                    if (curr == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(curr);
                    }
                }
            }

            System.out.println(stack.size() / 2);
        }
        sc.close();
    }
}
