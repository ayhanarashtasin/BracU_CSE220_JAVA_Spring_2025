public class Main {
  public static void main(String[] args) {
    int [] arr = {6,21,4,11,7,16,8,3,17,2,18,5,19,1};
    findMaximum(arr);
  }
  public static void findMaximum(int[] arr){
    int max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println(max);
  }
}
