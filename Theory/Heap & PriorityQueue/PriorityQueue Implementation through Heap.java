import java.util.ArrayList;
import java.util.Collections;

class practice {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int child_index = arr.size()-1;
            int parent_index = (child_index-1)/2;

            while(arr.get(child_index)<arr.get(parent_index)){

                Collections.swap(arr, child_index,parent_index);

                child_index = parent_index;
                parent_index  = (child_index-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minindex = i;

            if(left<arr.size() && arr.get(minindex)>arr.get(left)){
                minindex = left;
            }
            if(right<arr.size() && arr.get(minindex)>arr.get(right)){
                minindex = right;
            }
            if(minindex!=i){

                Collections.swap(arr, minindex,i);

                heapify(minindex);
            }

        }
        public int remove(){
            int data = arr.get(0);

            Collections.swap(arr, 0, arr.size()-1);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
