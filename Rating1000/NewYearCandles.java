package Rating1000;

import java.util.Scanner;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int hours = a;
        int stubs = a;

        while (stubs >= b) {
            int newCandle = stubs / b;
            hours += newCandle;
            stubs = (stubs % b) + newCandle;
        }

        System.out.println(hours);
    }
}
