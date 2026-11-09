package CodeforcesRound1131Div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StakesAndShapes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(tokenizer.nextToken());
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());

            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            int z = Integer.parseInt(tokenizer.nextToken());
            int n = x + y + z;

            char c;
            if (x >= y) c = 'P';       // Bob wins x, Alice wins y
            else if (y >= z) c = 'R';  // Bob wins y, Alice wins z
            else
                c = 'S';

            for (int i = 0; i < n; i++) {
                sb.append(c);
            }
            sb.append('\n');
        }
        
        System.out.println(sb);
    }
}
