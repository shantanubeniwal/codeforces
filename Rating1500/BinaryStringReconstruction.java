package Rating1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinaryStringReconstruction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int n0 = Integer.parseInt(st.nextToken());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            if (n0 > 0) for (int i = 0; i < n0 + 1; i++) sb.append('0');
            if (n2 > 0) for (int i = 0; i < n2 + 1; i++) sb.append('1');

            int rem;
            if (n0 > 0 && n2 > 0) rem = n1 - 1;
            else if (n0 > 0 || n2 > 0) rem = n1;
            else { sb.append('0'); rem = n1; }

            char last = sb.charAt(sb.length() - 1);
            for (int i = 0; i < rem; i++) {
                last = (last == '0') ? '1' : '0';
                sb.append(last);
            }
            out.append(sb).append('\n');
        }
        System.out.print(out);
    }
}


