package Rating1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BooksExchangeEasyVersion {
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

            int[] ans = new int[n + 1];
            boolean[] visit = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!visit[i]) {
                    ArrayList<Integer> cycle = new ArrayList<>();

                    int curr = i;
                    while (!visit[curr]) {
                        visit[curr] = true;
                        cycle.add(curr);
                        curr = kid[curr];
                    }

                    int cycleLength = cycle.size();
                    for (int node : cycle) {
                        ans[node] = cycleLength;
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}