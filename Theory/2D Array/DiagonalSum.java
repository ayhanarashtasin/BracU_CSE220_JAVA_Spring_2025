public class Matrix {
    public static void MatrixDiagonal(int[][] matrix) {
        int n = matrix.length;
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i]; 
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }

        System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3,  5,   7},
            {10, 11, 16},
            {20, 23, 30}
        };
        MatrixDiagonal(matrix);
    }
}
