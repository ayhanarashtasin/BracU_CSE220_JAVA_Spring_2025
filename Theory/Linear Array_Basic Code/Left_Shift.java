import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int [] arr = {6,21,4,11,7,16,8,3,17,2,18,5,19,1};
    leftshift(arr);
  }
  public static void leftshift(int [] arr){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
      arr[i]=arr[i+1];
    }
    arr[n-1]=0;
    System.out.println(Arrays.toString(arr));
  }
}
