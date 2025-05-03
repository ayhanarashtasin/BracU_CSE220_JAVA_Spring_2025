class MinHeap{
    private int[] arr;
    private int size;
    public MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }

    private void increasecapacity(){
        if (size == arr.length) {
            int[] new_array = new int[arr.length +1];
            System.arraycopy(arr, 0, new_array, 0, arr.length);
            arr = new_array;
        }
    }
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void insert(int data) {
        increasecapacity();
        arr[size] = data;
        int childIndex = size;
        int parentIndex = (childIndex - 1) / 2;
        swim(childIndex, parentIndex);
        size++;
    }
    private void swim(int childIndex,int parentIndex){
        while (childIndex > 0 && arr[childIndex] < arr[parentIndex]) {
            swap(childIndex, parentIndex);
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) / 2;
        }
    }
    public int peek() {
        return arr[0];
    }
    private void sink(int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIndex = i;

        if (left < n && arr[minIndex] > arr[left]) {
            minIndex = left;
        }
        if (right < n && arr[minIndex] > arr[right]) {
            minIndex = right;
        }
        if (minIndex != i) {
            swap(i, minIndex);
            sink(minIndex, n);
        }
    }
    public int extractMin() {
        int data = arr[0];
        swap(0, size - 1);
        size--;
        sink(0, size);
        return data;
    }
    public void heapsort() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            sink(i, size);
        }
        for (int i = size - 1; i > 0; i--) {
            swap(0, i);
            sink(0, i);
        }
    }
    public void printSorted() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class practiceMeanHeap {
    public static void main(String[] args) {
        int[] tasks = {2, 4, 7, 1, 6};
        int m=4;
        Task03(tasks,m);
    }
    public static void Task03(int[] tasks,int m){
        MinHeap h = new MinHeap(m);
        for(int i=0;i<m;i++){
            h.insert(0);
        }
        int index=0;
        while(!h.isEmpty()){
            int val = h.extractMin();
            h.insert(val+tasks[index]);
            index++;
            if(index==tasks.length){
                break;
            }
        }
        while(!h.isEmpty()){
            System.out.println(h.extractMin());
        }
    }
}
