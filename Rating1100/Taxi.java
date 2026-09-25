package Rating1100;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] groups = new int[5];
        for (int i = 0; i < n; i++) {
            groups[sc.nextInt()]++;
        }
        sc.close();

        int taxi = 0;

        // group 4 need 1 taxi 
        taxi += groups[4];

        // group 3 need 1 taxi and can take groups of 1 person
        taxi += groups[3];
        groups[1] = Math.max(0, groups[1] - groups[3]);

        // two group of 2 person can join 1 taxi
        taxi += groups[2] / 2;

        // if group of 2 person is odd then it need seprate taxi and can take two groups of 1 person
        if (groups[2] % 2 != 0) {
            taxi += 1;
            groups[1] = Math.max(0, groups[1] - 2);
        }

        // upto four groups of 1 person can go using 1 taxi 
        if (groups[1] > 0) {
            taxi += (groups[1] + 3) / 4;
        }

        System.out.println(taxi);


        /*
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] groups = new int[5];
        while (n-- > 0) {
            groups[sc.nextInt()]++;
        }
        sc.close();

        int taxi = 0;

        // (4)
        taxi += groups[4];
        groups[4] = 0;

        // (1,3)
        while (groups[1] > 0 && groups[3] > 0) {
            taxi++;
            groups[1]--;
            groups[3]--;
        }

        // (3)
        taxi += groups[3];
        groups[3] = 0;

        //(2,2)
        if (groups[2] >= 2 && groups[2] % 2 == 0) {
            taxi += (groups[2] / 2);
            groups[2] = 0;
        } else if (groups[2] > 2 && groups[2] % 2 != 0) {
            taxi += (groups[2] / 2);
            groups[2] = 1;
        }

        // (1)
        taxi += groups[1] / 4;
        groups[1] = groups[1] % 4;

        if (groups[1] >= 3 && groups[2] == 1) {
            taxi += 2;
        } else if(groups[1] > 0 || groups[2] > 0){
            taxi += 1;
        }
        System.out.println(taxi);
        */
    }
}
