package Rating1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class KefaAndPark {
    static List<Integer>[] adj;
    static int[] hasCat;
    static int m;
    static int validLeafCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());

        hasCat = new int[n + 1];
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            hasCat[i] = Integer.parseInt(tokenizer.nextToken());
        }

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int u = Integer.parseInt(tokenizer.nextToken());
            int v = Integer.parseInt(tokenizer.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        dfs(1, 0, hasCat[1]);

        System.out.println(validLeafCount);
    }
    
    static void dfs(int u, int p, int currentCats) {
        if (currentCats > m)
            return;

        boolean isLeaf = true;
        for (int v : adj[u]) {
            if (v != p) {
                isLeaf = false;

                int nextCats = (hasCat[v] == 1) ? currentCats + 1 : 0;
                dfs(v, u, nextCats);
            }
        }

        if (isLeaf && u != 1) {
            validLeafCount++;
        }
    }
}
