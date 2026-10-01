package Rating1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BerSUBall {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        int n = Integer.parseInt(tokenizer.nextToken());
        int[] boysSkills = new int[n];
        
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            boysSkills[i] = Integer.parseInt(tokenizer.nextToken());
        }
        
        tokenizer = new StringTokenizer(reader.readLine());
        int m = Integer.parseInt(tokenizer.nextToken());
        int[] girlsSkills = new int[m];

        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < m; i++) {
            girlsSkills[i] = Integer.parseInt(tokenizer.nextToken());
        }

        // sort both arrays
        Arrays.sort(boysSkills);
        Arrays.sort(girlsSkills);

        // traverse both arrays simultaneously 
        int i = 0;
        int j = 0;
        int pairs = 0;

        while (i < n && j < m) {
            int diff = boysSkills[i] - girlsSkills[j];
            if (Math.abs(diff) <= 1) {
                pairs++;
                i++;
                j++;
            } else {
                if (diff < 0) {
                    i++;
                } else {
                    j++;
                }
            }
        }

        System.out.println(pairs);
    }
}
