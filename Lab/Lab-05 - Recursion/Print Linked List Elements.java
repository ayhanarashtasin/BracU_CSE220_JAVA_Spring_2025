public static void task3B_recursive(Node head) {
    if (head == null) {
        return;
    }
    System.out.println(head.data);
    task3B_recursive(head.next);
}
