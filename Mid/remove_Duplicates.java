public Node remove_Duplicates(Node head) {

    Node current = head;

    while (current != null) {

        Node previous = current;
        Node checker = current.next;

        while (checker != null) {

            if (current.elem == checker.elem) {
                previous.next = checker.next;
                checker = previous.next;
            } else {
                previous = checker;
                checker = checker.next;
            }
        }

        current = current.next;
    }

    return head;
}
