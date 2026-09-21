package Rating1000;

import java.util.Scanner;

public class StringTask {
    public static boolean isVowel(char ch) {
        return switch (ch) {
            case 'a' -> true;
            case 'e' -> true;
            case 'i' -> true;
            case 'o' -> true;
            case 'u' -> true;
            case 'y' -> true;
            case 'A' -> true;
            case 'E' -> true;
            case 'I' -> true;
            case 'O' -> true;
            case 'U' -> true;
            case 'Y' -> true;
            default -> false;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (isVowel(ch)) {
                continue;
            } else if (ch > 96) {
                sb.append(".").append(ch);
            } else {
                int lowerCase = ch - 'A' + 'a';
                sb.append(".").append((char) lowerCase);
            }
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}
