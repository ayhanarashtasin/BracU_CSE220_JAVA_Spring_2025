class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class Main{
    public static ListNode createLinkedList(int... values){
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for(int i = 1; i < values.length; i++){
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args){
        ListNode head = createLinkedList(10, 20, 30, 40, 50,60,70,80,90,100);
        printLinkedList(head);
    }
    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val);
            if(current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }
}
