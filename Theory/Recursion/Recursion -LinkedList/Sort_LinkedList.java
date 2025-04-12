class Node {
  int value;
  Node next;
  public Node(int value) {
    this.value = value;
    this.next = null;
  }
}

public class Main {
  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(20);
    head.next.next = new Node(13);
    head.next.next.next = new Node(14);
    head.next.next.next.next = new Node(5);
    sortLL_recursive(head);
    PrintLinkedList(head);
  }

  static void sortLL_recursive(Node head) {
    if (head == null || head.next == null) {
      return;
    }
    boolean swapped = false;
    swapped = compareAndSwap(head, swapped);
    if (swapped) {
      sortLL_recursive(head); 
    }
  }

  static boolean compareAndSwap(Node head, boolean swapped) {
    if (head == null || head.next == null) {
      return swapped;
    }
    if (head.value > head.next.value) {
      int temp = head.value;
      head.value = head.next.value;
      head.next.value = temp;
      swapped = true;
    }
    return compareAndSwap(head.next, swapped);
  }

  static void PrintLinkedList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
  }
}
