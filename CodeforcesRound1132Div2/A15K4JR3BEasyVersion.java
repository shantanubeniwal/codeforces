package CodeforcesRound1132Div2;

import java.util.Scanner;

public class A15K4JR3BEasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int base = n / 2;
            int height = n - base;
            int area = base * height;
            System.out.println(area);
        }
    }
}
