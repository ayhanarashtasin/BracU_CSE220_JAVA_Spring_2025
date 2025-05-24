import java.util.*;

public class Matrix {
    public static int MatrixLowerTriangle(int[][] matrix, int target) {
        int n=matrix.length;
        int lowertriangle=0;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=i;j--){
                lowertriangle+=matrix[i][j];
            }
        }
        return lowertriangle;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3,  5,   7},
            {10, 11, 16},
            {20, 23, 30}
        };
        int target = 16;
        System.out.println(MatrixLowerTriangle(matrix, target));
    }
}
