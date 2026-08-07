public static int task2D_recursive(int[] arr, int index) {
    if (index == arr.length) {
        return 0;
    }
    return arr[index] + task2D_recursive(arr, index + 1);
}
