class Node {
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class Lab3 {
    public static Node summodd(Node head){
        int sum = 0;
        Node buildLL = head;
        Node current = head.next;

        while(current!=head){
            if(current.data %2==1){
                sum+=current.data;
                buildLL.next = current.next;
                current = current.next;
            }else{
                buildLL = current;
                current = current.next;
            }
        }
        Node sumnode = new Node(sum);
        buildLL.next = sumnode;
        sumnode.next = head;
        return head;

    }
    public static void printLinkedList(Node head) {
        Node temp = head.next;
        while (temp != head) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node n1 = new Node(11);
        Node n2 = new Node(22);
        Node n3 = new Node(33);
        Node n4 = new Node(44);
        Node n5 = new Node(55);
        Node n6 = new Node(66);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = head;
        Node val = summodd(head);
        printLinkedList(val);
    }
}
