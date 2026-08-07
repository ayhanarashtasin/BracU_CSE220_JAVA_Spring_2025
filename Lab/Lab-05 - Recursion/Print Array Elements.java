public static void task2B_recursive(int[] arr, int index) {
    if (index == arr.length) {
        return;
    }
    System.out.println(arr[index]);
    task2B_recursive(arr, index + 1);
}
