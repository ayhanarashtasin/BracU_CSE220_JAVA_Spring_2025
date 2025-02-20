import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int [] arr = {6,21,4,11,7,16,8,3,17,2,18,5,19,1};
    leftrotate(arr);
  }
  public static void leftrotate(int [] arr){
    int temp = arr[0];
    for(int i = 0; i < arr.length - 1; i++){
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = temp;
    System.out.println(Arrays.toString(arr));
  }
}
