package Rating1000;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        String target = "hello";
        int targetIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
                if (targetIndex == 5) {
                    break;
                }
            }
        }

        if (targetIndex == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        /*
        String s = sc.next();
        char[] words = s.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < words.length) {
            if (words[i] == 'h') {
                sb.append(words[i]);
                i++;
                break;
            }
            i++;
        }
        while (i < words.length) {
            if (words[i] == 'e') {
                sb.append(words[i]);
                i++;
                break;
            }
            i++;
        }
        while (i < words.length) {
            if (words[i] == 'l') {
                sb.append(words[i]);
                i++;
                break;
            }
            i++;
        }
        while (i < words.length) {
            if (words[i] == 'l') {
                sb.append(words[i]);
                i++;
                break;
            }
            i++;
        }
        while (i < words.length) {
            if (words[i] == 'o') {
                sb.append(words[i]);
                i++;
                break;
            }
            i++;
        }
        
        if (sb.toString().equals("hello")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        */

        sc.close();
    }
}
