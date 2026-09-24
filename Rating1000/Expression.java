package Rating1000;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int maxValue = 0;
        int value = 0;

        value = a + b + c;
        maxValue = Math.max(maxValue, value);
        value = a * b * c;
        maxValue = Math.max(maxValue, value);
        value = a * b + c;
        maxValue = Math.max(maxValue, value);
        value = a + b * c;
        maxValue = Math.max(maxValue, value);
        value = (a + b) * c;
        maxValue = Math.max(maxValue, value);
        value = a * (b + c);
        maxValue = Math.max(maxValue, value);

        System.out.println(maxValue);
    }
}
