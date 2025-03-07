import java.util.Arrays;
public class Main {
    public static void columnsum(int[][] Matrix) {
        int row = Matrix.length;
        int col = Matrix[0].length;
        int[] sum = new int[2];
        int index = 0;
        int colsum = 0;
      
        for (int i = 0; i < col; i++) {
            int tempsum = 0;
            for (int j = 0; j < row; j++) {
                tempsum += Matrix[j][i];
            }
            if (i > 0 && index < 2) {
                sum[index] = tempsum - colsum;
                index++;
            }
            colsum = tempsum;
        }
        System.out.println(Arrays.toString(sum));
    }
