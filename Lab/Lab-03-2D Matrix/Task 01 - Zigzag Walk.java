import java.util.Arrays;
public class ZigzagWalk {
    public static void walkZigzag(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = row - 1;
        int left = 0;

        while (left < col) {
            if (left % 2 == 0) {
                for (int i = top; i <= bottom; i += 2) {
                    System.out.print(matrix[i][left] + " ");
                }
                System.out.println();
                left++;
            } else {
                if (row % 2 != 0) {
                    for (int i = bottom - 1; i >= top; i -= 2) {
                        System.out.print(matrix[i][left] + " ");
                    }
                } else {
                    for (int i = bottom; i >= top; i -= 2) {
                        System.out.print(matrix[i][left] + " ");
                    }
                }
                System.out.println();
                left++;
            }
        }
    }
