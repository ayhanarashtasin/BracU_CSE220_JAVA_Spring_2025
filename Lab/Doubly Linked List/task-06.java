public void pairJoin(Node head1, Node head2) {
        Node current1 = head1.next;
        Node current2 = head2.next;
        while (current1 != null) {
            Node next1 = current1.next;
            Node next2 = current2.next;
          
            current1.next = current2;
            current2.prev = current1;
          
            current2.next = next1;
            next1.prev = current2;
          
            current1 = next1;
            current2 = next2;
        }
        current2.next = head1;
        head1.prev = current2;
    }
