package Rating1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BooksExchangeHardVersion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int q = Integer.parseInt(tokenizer.nextToken());
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());

            tokenizer = new StringTokenizer(reader.readLine());
            int[] kid = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                kid[i] = Integer.parseInt(tokenizer.nextToken());
            }

            boolean[] visited = new boolean[n + 1];
            int[] ans = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    List<Integer> cycle = new ArrayList<>();

                    int curr = i;
                    while (!visited[curr]) {
                        visited[curr] = true;
                        cycle.add(curr);
                        curr = kid[curr];
                    }

                    int cycleLenght = cycle.size();
                    for (int node : cycle) {
                        ans[node] = cycleLenght;
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}
