package CodeforcesRound1131Div3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FractionAndSix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(tokenizer.nextToken());

        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            
            String p = reader.readLine();
            String q = reader.readLine();

            int[] countp = new int[26];
            for (int i = 0; i < n; i++) {
                countp[p.charAt(i) - 'a']++;
            }

            int[] countq = new int[26];
            for (int i = 0; i < m; i++) {
                countq[q.charAt(i) - 'a']++;
            }

            // cancle common
            for (int i = 0; i < 26; i++) {
                int common = Math.min(countp[i], countq[i]);
                countp[i] -= common;
                countq[i] -= common;
            }

            // check denomintor is empty 
            boolean denominatorEmpty = true;
            for (int i = 0; i < 26; i++) {
                if (countq[i] > 0) {
                    denominatorEmpty = false;
                    break;
                }
            }

            boolean numeratorIsSix = (countp['s' - 'a'] == 1 && countp['i' - 'a'] == 1 && countp['x' - 'a'] == 1);

            int remainingPCount = 0;
            for (int i = 0; i < 26; i++) {
                remainingPCount += countp[i];
            }

            if (denominatorEmpty && numeratorIsSix && remainingPCount == 3) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
