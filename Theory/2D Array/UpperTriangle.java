import java.util.*;

public class Matrix {
    public static int MatrixUpperTriangle(int[][] matrix) {
        int n=matrix.length;
        int uppertriangle=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i;j++){
                uppertriangle+=matrix[i][j];
            }
        }
        return uppertriangle;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3,  5,   7},
            {10, 11, 16},
            {20, 23, 30}
        };
        System.out.println(MatrixUpperTriangle(matrix));
    }
}
