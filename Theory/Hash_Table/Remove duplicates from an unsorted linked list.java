import java.util.Hashtable;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesWithHashtable {

    // Function to remove duplicates using Hashtable
    public static Node removeDuplicates(Node head) {
        if (head == null) return null;

        Hashtable<Integer, Boolean> table = new Hashtable<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (table.containsKey(current.data)) {
                // Duplicate found, skip current node
                prev.next = current.next;
            } else {
                // New element, add to hashtable and move prev
                table.put(current.data, true);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }

    // Helper function to print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function to test the code
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
