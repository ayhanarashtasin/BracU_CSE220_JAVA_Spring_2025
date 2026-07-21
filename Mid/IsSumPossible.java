public boolean IsSumPossible(Node head, int n) {

    if (head == null || head.next == null) {
        return false;
    }

    Node first = head;

    while (first != null) {

        Node second = first.next;

        while (second != null) {

            if ((int) first.elem + (int) second.elem == n) {
                return true;
            }

            second = second.next;
        }

        first = first.next;
    }

    return false;
}
