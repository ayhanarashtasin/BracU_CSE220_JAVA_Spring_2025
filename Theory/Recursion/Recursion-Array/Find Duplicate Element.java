import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6,7,8,9,10};
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(FindDuplicate(arr,0,list));
    }
    static ArrayList<Integer>FindDuplicate(int[] arr,int index, ArrayList<Integer> list){
        if(arr.length-1 == index){
            return list;
        }
        if(arr[index] == arr[index+1]){
            list.add(arr[index]);
        }
        return FindDuplicate(arr,index+1,list);
    }

}
