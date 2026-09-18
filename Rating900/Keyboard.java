package Rating900;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        // optimised appraoch
        Scanner sc = new Scanner(System.in);

        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

        String shift = sc.next();
        int indexShift = (shift.charAt(0) == 'L') ? 1 : -1;

        String input = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);

            int index = keyboard.indexOf(curr);

            sb.append(keyboard.charAt(index + indexShift));
        }

        System.out.println(sb.toString());
        sc.close();

        // Brute force appraoch
        /*
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String topRow = "qwertyuiop";
        String middleRow = "asdfghjkl;";
        String bottomRow = "zxcvbnm,./";

        String s = sc.next();
        char shift = s.charAt(0);

        int indexShift = 0;
        if (shift == 'L') {
            indexShift = 1;
        } else {
            indexShift = -1;
        }

        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if(topRow.indexOf(curr) != -1){
                sb.append(topRow.charAt(topRow.indexOf(curr) + indexShift));
            }
            if(middleRow.indexOf(curr) != -1){
                sb.append(middleRow.charAt(middleRow.indexOf(curr) + indexShift));
            }
            if(bottomRow.indexOf(curr) != -1){
                sb.append(bottomRow.charAt(bottomRow.indexOf(curr) + indexShift));
            }
        }

        System.out.println(sb.toString());
        sc.close();
        */
    }
}
