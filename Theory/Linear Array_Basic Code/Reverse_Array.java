import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int [] arr = {6,21,4,11,7,16,8,3,17,2,18,5,19,1};
    reverse(arr);
  }
  public static void reverse(int [] arr){
    int start = 0;
    int end = arr.length-1;
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    System.out.println(Arrays.toString(arr));
  }
}
