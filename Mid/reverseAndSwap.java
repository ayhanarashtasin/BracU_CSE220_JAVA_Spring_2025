public Node reverseAndSwap(Node head, int i) {

    if (head == null) {
        return null;
    }

    Node previous = null;
    Node current = head;
    Node nextNode = null;

    int index = 0;

    while (index <= i) {
        nextNode = current.next;
        current.next = previous;
        previous = current;
        current = nextNode;

        index++;
    }

    if (current == null) {
        return previous;
    }

    Node unchangedTail = current;

    while (unchangedTail.next != null) {
        unchangedTail = unchangedTail.next;
    }

    unchangedTail.next = previous;

    return current;
}
