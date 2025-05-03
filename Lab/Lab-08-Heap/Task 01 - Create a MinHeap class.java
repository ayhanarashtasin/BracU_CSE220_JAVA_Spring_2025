class Task{
    static class MinHeap{
        private int[] arr;
        private int size;
        public MinHeap(int capacity){
            arr = new int[capacity];
            size = 0;
        }

        private void increasecapacity() {
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

        private void heapify(int i, int n) {
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
                heapify(minIndex, n);
            }
        }

        public int remove() {
            int data = arr[0];
            swap(0, size - 1);
            size--;
            heapify(0, size);
            return data;
        }
        public void heapsort() {
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(i, size);
            }
            for (int i = size - 1; i > 0; i--) {
                swap(0, i);
                heapify(0, i);
            }
        }
        public void printSorted() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
