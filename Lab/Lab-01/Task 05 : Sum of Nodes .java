import java.util.Arrays;
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

public class Task5 {
    //this is my helper function
    public static int findNodevalue(ListNode head , int position){
        ListNode temp = head;
        for(int i=0; i<position; i++){
            if(temp ==null){
                return 0;
            }
            temp = temp.next;
        }
        return temp.val;

    }
    //Main Code start from here
    public static int sumDist(ListNode head, Integer[] distArr) {
        int sum = 0;
        for(int i=0; i<distArr.length; i++){
            sum+=findNodevalue(head,distArr[i]);
        }
        return sum; 
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        ListNode head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	    System.out.print("Given LinkedList: ");
	    LinkedList.printLL(head1);
	    System.out.print("Distance Array: ");
	    System.out.println(Arrays.toString(dist));
        System.out.println("\nExpected Output: 4");
	    int returnedValue = Task5.sumDist(head1, dist);
	    System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
