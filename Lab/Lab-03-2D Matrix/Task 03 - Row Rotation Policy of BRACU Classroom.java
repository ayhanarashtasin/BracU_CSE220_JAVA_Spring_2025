public class Main {
    public static  int rowrotation(int examweek , String[][] Matrix) {
      int n = Matrix.length;
      int k = (examweek % n)-1;
      int i = 0;
      int j = Matrix.length-1;
      while(i<j){
        String[] temp =  Matrix[i];
        Matrix[i] = Matrix[j];
        Matrix[j] = temp;
        i++;
        j--;
      }
      i = 0;
      j = k-1;
      while(i<j){
        String[] temp =  Matrix[i];
        Matrix[i] = Matrix[j];
        Matrix[j] = temp;
        i++;
        j--;
      }
      i = k+1;
      j = Matrix.length-1;
      while(i<j){
        String[] temp =  Matrix[i];
        Matrix[i] = Matrix[j];
        Matrix[j] = temp;
        i++;
        j--;
      }
      for(int row=0; row<Matrix.length; row++){
        for(int col=0; col<Matrix[row].length; col++){
          if(Matrix[row][col]=="AA"){
            return row+1;
          }
        }
      }
      // Default return value if "AA" is not found
      return -1;
    }
