import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int [] arr = {6,21,4,11,7,16,8,3,17,2,18,5,19,1};
    rightrotate(arr);
  }
  public static void rightrotate(int [] arr){
    int n = arr.length;
    int temp = arr[n-1];
    for(int i=n-1;i>0;i--){
      arr[i] = arr[i-1];
    }
    arr[0] = temp;
    System.out.println(Arrays.toString(arr));
  }
}
