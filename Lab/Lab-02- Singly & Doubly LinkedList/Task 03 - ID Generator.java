public class Task3 {
    public static Node idGenerator(Node head1, Node head2, Node head3) {
        // Reverse the first linked list
        Node curr = head1;
        Node prev = null;
        while (curr != null) {
            Node front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        
        // Create a new list for the second part (sum of head2 and head3, mod 10)
        Node dummy = new Node(-1);
        Node curr = dummy;
        Node temp2 = head2;
        Node temp3 = head3;
        while (temp2 != null && temp3 != null) {
            Node newNode = new Node((temp2.elem + temp3.elem) % 10);
            curr.next = newNode;
            curr = newNode;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        
        // Append the sum list to the reversed list
        Node current = prev;
        while (current.next != null) {
            current = current.next;
        }
        current.next = dummy.next;
        
        return prev;
    }
}
