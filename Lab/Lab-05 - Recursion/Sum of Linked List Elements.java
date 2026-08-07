public static int task3C_recursive(Node head) {
    if (head == null) {
        return 0; 
    }
    return head.data + task3C_recursive(head.next);
}
