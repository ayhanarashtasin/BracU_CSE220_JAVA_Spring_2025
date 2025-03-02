public class Task2 {

    public static Node wordDecoder( Node head ){
        Node temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        int l = 13%count;
        Node current = head;
        Node prev = null;
        Node dummy = new Node(null)
        int index=0;
        while(current!=null){
            if (index%l==0 && index!=0){
                Node New_Node = new Node(current.elem);
                New_Node.next = prev;
                prev = New_Node;
            }
            index++;
            current = current.next;
        }
        dummy.next = prev
        return dummy;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
