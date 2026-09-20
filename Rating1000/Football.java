package Rating1000;

// import java.util.HashMap;
// import java.util.Iterator;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // solution with using voting algorithm
        int n = sc.nextInt();

        String prev = sc.next();
        int goal = 1;
        while (n-- > 1) {
            String curr = sc.next();
            if (curr.equals(prev)) {
                goal++;
            } else {
                goal--;
                if (goal == 0) {
                    prev = curr;
                    goal = 1;
                }
            }
        }

        System.out.println(prev);


        // solution using hashmap
        // HashMap<String, Integer> map = new HashMap<>();

        // while (n-- > 0) {
        //     String team = sc.next();
        //     map.put(team, map.getOrDefault(team, 0) + 1);
        // }

        // if (map.size() == 1) {
        //     System.out.println(map.keySet().iterator().next());
        // } else {
        //     Iterator<String> iterator = map.keySet().iterator();
        //     String team1 = iterator.next();
        //     String team2 = iterator.next();

        //     if (map.get(team1) > map.get(team2)) {
        //         System.out.println(team1);
        //     } else {
        //         System.out.println(team2);
        //     }
        // }
        sc.close();
    }
}
