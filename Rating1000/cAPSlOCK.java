// 131A - cAPS lOCK 
// cleaner code
package Rating1000;

import java.util.Scanner;

public class cAPSlOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int n = s.length();
        int capitalCount = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                capitalCount++;
            }
        }

        if (capitalCount == n) {
            System.out.println(s.toLowerCase());
        }else if(capitalCount == n - 1 && Character.isLowerCase(s.charAt(0))){
            System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase());
        }else{
            System.out.println(s);
        }
    }
}

/*
//  	131A - cAPS lOCK 
package Rating1000;

import java.util.Scanner;

public class cAPSlOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();
        int capitalCount = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                capitalCount++;
            }
        }

        if (capitalCount == n) {
            System.out.println(s.toLowerCase());
            sc.close();
            return;
        }

        if (capitalCount == n - 1 && Character.isLowerCase(s.charAt(0))) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (Character.isLowerCase(ch)) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            }

            System.out.println(sb.toString());
            sc.close();
            return;
        }

        System.out.println(s);
        sc.close();
    }
}
*/