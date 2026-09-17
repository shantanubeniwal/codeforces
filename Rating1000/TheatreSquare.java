package Rating1000;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long lengthStones = ((n + a - 1) / a);
        long breadthStones = ((m + a - 1) / a);

        System.out.println(lengthStones * breadthStones);
        sc.close();
    }
}
