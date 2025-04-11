public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Search(arr,0,12));
    }
    static int Search(int[] arr,int index,int target){
        if(arr.length-1 == index){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return Search(arr,index+1,target);
    }

}
