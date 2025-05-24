import java.util.*;

public class Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 5, 7},
            {10, 11, 16},
            {20, 23, 30}
        };
        int target = 16;
        System.out.println(searchMatrix(matrix, target));
    }
}
