static void rangeReverse(Node dHead, int start, int end) {

    if (dHead == null || dHead.next == null || start < 0 || end < start) {
        return;
    }

    Node beforeStart = dHead;

    for (int index = 0; index < start; index++) {

        if (beforeStart.next == null) {
            return;
        }

        beforeStart = beforeStart.next;
    }


    if (beforeStart.next == null) {
        return;
    }

    Node rangeFirst = beforeStart.next;
    Node current = rangeFirst;
    Node previous = null;
    Node nextNode;

    int numberOfNodesToReverse = end - start + 1;
    int count = 0;


    while (current != null && count < numberOfNodesToReverse) {

        nextNode = current.next;
        current.next = previous;

        previous = current;
        current = nextNode;

        count++;
    }


    beforeStart.next = current;

    rangeFirst.next = dHead.next;

    dHead.next = previous;
}
