public static boolean pairWiseEqual(Node h1, Node h2) {

    Node current1 = h1;
    Node current2 = h2;

    while (current1 != null && current2 != null) {

        if (current1.next == null || current2.next == null) {
            return false;
        }

        int firstValue1 = (int) current1.elem;
        int secondValue1 = (int) current1.next.elem;

        int firstValue2 = (int) current2.elem;
        int secondValue2 = (int) current2.next.elem;

        boolean sameOrder =
                firstValue1 == firstValue2 &&
                secondValue1 == secondValue2;

        boolean reverseOrder =
                firstValue1 == secondValue2 &&
                secondValue1 == firstValue2;


        if (!sameOrder && !reverseOrder) {
            return false;
        }

        current1 = current1.next.next;
        current2 = current2.next.next;
    }

    return current1 == null && current2 == null;
}
