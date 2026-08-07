public static int task2F_recursive(int[] arr) {
    int product = multiplyOdds(arr, 0);
    int sum = sumEvens(arr, 0);
    return product - sum;
}

public static int multiplyOdds(int[] arr, int index) {
    if (index == arr.length) {
        return 1;
    }
    if (arr[index] % 2 != 0) {
        return arr[index] * multiplyOdds(arr, index + 1);
    }
    return multiplyOdds(arr, index + 1);
}

public static int sumEvens(int[] arr, int index) {
    if (index == arr.length) {
        return 0;
    }
    if (arr[index] % 2 == 0) {
        return arr[index] + sumEvens(arr, index + 1);
    }
    return sumEvens(arr, index + 1);
}
