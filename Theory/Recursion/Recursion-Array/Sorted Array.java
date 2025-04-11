public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Sorted(arr,0));
    }
    static boolean Sorted(int[] arr,int index){
        if(arr.length-1 == index){
            return true;
        }
        return arr[index] < arr[index+1] && Sorted(arr,index+1);
    }

}
