class MaxHeap {
    private int[] arr;
    private int size;

    public MaxHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    private void increaseCapacity() {
        if (size == arr.length) {
            int[] newArray = new int[arr.length + 1];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;
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
        increaseCapacity();
        arr[size] = data;
        int childIndex = size;
        int parentIndex = (childIndex - 1) / 2;
        swim(childIndex, parentIndex);
        size++;
    }

    private void swim(int childIndex, int parentIndex) {
        while (childIndex > 0 && arr[childIndex] > arr[parentIndex]) {
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
        int maxIndex = i;

        if (left < n && arr[maxIndex] < arr[left]) {
            maxIndex = left;
        }
        if (right < n && arr[maxIndex] < arr[right]) {
            maxIndex = right;
        }
        if (maxIndex != i) {
            swap(i, maxIndex);
            sink(maxIndex, n);
        }
    }

    public int extractMax() {
        int data = arr[0];
        swap(0, size - 1);
        size--;
        sink(0, size);
        return data;
    }

    public void heapSort() {
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
        int[] tasks = {4, 10, 2, 8, 6, 7};
        int k=3;
        TopKLargestElement(tasks,k);
    }
    public static void TopKLargestElement(int[] nums , int k){
        MaxHeap h = new MaxHeap(0);
        for(int i=0;i<nums.length;i++){
            h.insert(nums[i]);
        }
        int[] arr = new int[k];
        int index=0;
        while (!h.isEmpty() && index < k) {
            arr[index] = h.extractMax();
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
