public class Main {
  public static void playGame(int[][] arena) {
    int row = arena.length;
    int col = arena[0].length;
    int sum = 0;
    for (int i = 0; i < row; i++){
      for (int j = 0; j < col; j++){
        if (arena[i][j] != 0 && arena[i][j] % 50 == 0){
          if (i > 0 && arena[i - 1][j] == 2){
            sum+=2;
          }
          if (i < row - 1 && arena[i + 1][j] == 2){
            sum+=2;
          }
          if (j > 0 && arena[i][j - 1] == 2){
            sum+=2;
          }
          if (j < col - 1 && arena[i][j + 1] == 2){
            sum+=2;
          }
        }
      }
    }
    if (sum >= 10) {
      System.out.println("Points Gained: " + sum + ". Your team has survived the game.");
    } else {
      System.out.println("Points Gained: " + sum + ". Your team is out.");
    }
  }
