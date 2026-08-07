public static int task3F_recursive(Node head) {
    int oddSum = sumOdds(head);
    int evenProduct = multiplyEvens(head);
    return oddSum - evenProduct;
}

public static int sumOdds(Node head) {
    if (head == null) {
        return 0;
    }
    if (head.data % 2 != 0) {
        return head.data + sumOdds(head.next);
    }
    return sumOdds(head.next);
}

public static int multiplyEvens(Node head) {
    if (head == null) {
        return 1;
    }
    if (head.data % 2 == 0) {
        return head.data * multiplyEvens(head.next);
    }
    return multiplyEvens(head.next);
}
