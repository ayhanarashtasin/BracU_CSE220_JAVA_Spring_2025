import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int [] arr = {6,21,4,11,7,16,8,3,17,2,18,5,19,1};
    rightshift(arr);
  }
  public static void rightshift(int [] arr){
    int n=arr.length;
    for(int i=n-1;i>0;i--){
      arr[i]=arr[i-1];
    }
    arr[0]=0;
    System.out.println(Arrays.toString(arr));
  }
}
