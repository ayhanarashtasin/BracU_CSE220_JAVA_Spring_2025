import java.util.*;

public class Matrix {
    public static void MatrixTranspose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3,  5,   7},
            {10, 11, 16},
            {20, 23, 30}
        };
        MatrixTranspose(matrix);
    }
}
