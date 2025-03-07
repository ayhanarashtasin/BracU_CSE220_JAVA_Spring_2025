import java.util.Arrays;
public class Main {
  public static void zigzagwalk(int[][] Matrix){
    int row = Matrix.length;
    int col = Matrix[0].length;
    int top = 0;
    int bottom = row-1;
    int left = 0;
    while(left<col){
      if(left%2==0){
        for(int i=top;i<=bottom;i+=2){
          System.out.print(Matrix[i][left]+" ");
        }
        System.out.println(" ");
        left+=1;
      }
      else{
        for(int i=bottom-1; i>top;i-=2){
          System.out.print(Matrix[i][left]+" ");
        }
        System.out.println(" ");
        left+=1;
      }
    }
  }
