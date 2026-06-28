public static Boolean assembleCongaLine(Node head) {


    if (head == null || head.next == null) {
        return true;
    }

    Node current = head;

    while (current.next != null) {

        if (current.data > current.next.data) {
            return false;
        }

        current = current.next;
    }

    return true;
}
