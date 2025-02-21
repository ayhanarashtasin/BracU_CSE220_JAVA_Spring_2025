public static void InsertNthPosition(ListNode head, int val,int pos){
        ListNode newNode = new ListNode(val);
        if(pos==0){
            newNode.next=head;
            head = newNode;
            printLinkedList(head);
            return;
        }
        ListNode temp = head;
        for(int i=0; i<pos-2; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        printLinkedList(head);
    }
