class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    // Method to create a linked list from an array
    public static ListNode createList(Integer[] arr) { // Change int[] to Integer[]
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Method to print a linked list
    public static void printLL(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Task4 {

    public static Boolean assembleCongaLine(ListNode head){
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.val>temp.next.val){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args){

        System.out.println("==============Test Case 1=============");
        ListNode congaLine = LinkedList.createList(new Integer[]{10,15,34,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);
        System.out.println("Expected output: true");
        System.out.println("Your output: "+assembleCongaLine(congaLine));
        System.out.println();

        System.out.println("==============Test Case 2=============");
        congaLine = LinkedList.createList(new Integer[]{10,15,44,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);
        System.out.println("Expected output: false");
        System.out.println("Your output: "+assembleCongaLine(congaLine));
        System.out.println();
    }
}
