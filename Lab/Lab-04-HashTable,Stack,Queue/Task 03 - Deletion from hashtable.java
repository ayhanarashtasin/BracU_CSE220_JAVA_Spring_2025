private int hashFunction(Integer key) {
        if (key == null) {
            return -1;
        }
        return (key + 3) % ht.length;
    }
    public void remove(Integer key) {
        int index = hashFunction(key);
        if (idx == -1) {
            return;
        }
        PairNode head = ht[index]
        PairNode current = head.next;
        PairNode prev = head;

        while (current != null) {
            if (current.key == key) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
        return;
    }
}
