package Rating1200;

import java.util.Scanner;

public class IceSkating {
    static int n;
    static int[][] coordinate;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        coordinate = new int[n][2];
        for (int i = 0; i < n; i++) {
            coordinate[i][0] = sc.nextInt();
            coordinate[i][1] = sc.nextInt();
        }

        visited = new boolean[n];

        int components = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                components++;
            }
        }

        System.out.println(components - 1);
    }

    public static void dfs(int u) {
        visited[u] = true;
        for (int v = 0; v < n; v++) {
            if (!visited[v]) {
                if (coordinate[u][0] == coordinate[v][0] || coordinate[u][1] == coordinate[v][1]) {
                    dfs(v);
                }
            }
        }
    }
}
