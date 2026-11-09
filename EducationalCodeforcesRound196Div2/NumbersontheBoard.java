package EducationalCodeforcesRound196Div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumbersontheBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());

            int l = Integer.parseInt(tokenizer.nextToken());
            int r = Integer.parseInt(tokenizer.nextToken());

            int numbers = (r - l + 1);
            if (l == 0 && r == 0) {
                System.out.println(0);
            }else if (l >= 0 && r >= 0) {
                if (l == 0) {
                    System.out.println(numbers - 2);
                } else {
                    System.out.println(numbers - 1);
                }
            } else if (l <= 0 && r <= 0) {
                if (r == 0) {
                    System.out.println(numbers - 2);
                } else {
                    System.out.println(numbers - 1);
                }
            } else {
                // +ve and -ve
                if (r == Math.abs(l)) {
                    System.out.println(0);
                }else if (r > Math.abs(l)) {
                    System.out.println(r + l - 1);
                } else {
                    System.out.println(-r - l - 1);
                }
            }
        }
    }
}
