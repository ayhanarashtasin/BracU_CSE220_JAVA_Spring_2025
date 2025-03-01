class Node{

    Object elem;
    Node next;

    public Node(Object elem, Node next){
        this.elem = elem;
        this.next = next;
    }

    //Overloading
    public Node(Object elem){
        this.elem = elem;
        this.next = null;
    }
}
class LinkedList{

    //This static method will convert an Array into a LinkedList 
    //The return type is Node since it'll return a head
    public static Node createList( Object[] arr ){
        Node head = new Node( arr[0] );
        Node n = head;
        for ( int i=1; i<arr.length; i++ ){
            Node newN = new Node( arr[i] );
            n.next = newN;
            n = n.next;
        }
        return head;
    }

    public static void printLL(Node head){
        Node n = head;
        while (n!=null){
            if (n.next !=null)
                System.out.print(n.elem+" -> ");
            else
                System.out.println(n.elem);
            n = n.next;
        }
    }

}
