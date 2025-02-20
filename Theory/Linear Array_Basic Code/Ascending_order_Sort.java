import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int [] arr = {6,21,4,11,7,16,8,3,17,2,18,5,19,1};
    sort(arr);
  }
  public static void sort(int [] arr){
    int n = arr.length;
    int i=0;
    while(i<n-1){
      if(arr[i]>arr[i+1]){
        int temp = arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
        i=-1;
      }
      i++;
    }
    System.out.println(Arrays.toString(arr));
  }
}
