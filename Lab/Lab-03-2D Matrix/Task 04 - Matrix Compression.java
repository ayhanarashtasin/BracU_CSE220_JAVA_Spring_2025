import java.util.Arrays;

public class Main {
  public static void compressMatrix(int[][] mat) {
    int row = mat.length;
    int col = mat[0].length;
    int r = row / 2;
    int c = col / 2;
    int[][] compressed = new int[r][c];

    int rw = 0, cl = 0;

    for (int i = 0; i < row; i += 2) {
        for (int j = 0; j < col; j += 2) {
            int sum = mat[i][j] + mat[i + 1][j] + mat[i][j + 1] + mat[i + 1][j + 1];
            compressed[rw][cl] = sum;
            cl++;
        }
        rw++;
        cl = 0;
    }
    System.out.println(Arrays.deepToString(compressed));  
  }
