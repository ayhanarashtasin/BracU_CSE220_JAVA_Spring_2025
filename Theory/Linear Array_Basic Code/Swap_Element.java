import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int [] arr = {6,21,4,11,7,16,8,3,17,2,18,5,19,1};
    Swap(arr,0,3);
  }
  public static void Swap(int [] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    System.out.println(Arrays.toString(arr));
  }
}
