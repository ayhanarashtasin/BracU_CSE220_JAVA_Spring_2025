public void rangeMove(Node head, int start, int end) {
        int size = 0;
        Node counter = head.next;
        while (counter != head) {
            size++;
            counter = counter.next;
        }
        Node current = head.next;
        for (int i = 0; i < size; i++) {
            Node nextNodeToProcess = current.next;
            if (current.data >= start && current.data <= end) {
                current.prev.next = current.next;
                current.next.prev = current.prev;

                Node tail = head.prev;
                tail.next = current;
                current.prev = tail;
                current.next = head;
                head.prev = current;
            }
            current = nextNodeToProcess;
        }
}
