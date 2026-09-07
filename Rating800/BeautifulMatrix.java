package Rating800;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[5][5];

        // read the input and feed into matrix
        for (int[] row : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                row[j] = sc.nextInt();
            }
        }

        // find the location of the '1' in matrix
        int row = 0;
        int column = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    row = i;
                    column = j;
                }
            }
        }

        int steps = Math.abs(row - 2) + Math.abs(column - 2);

        System.out.println(steps);
        sc.close();
    }
}
