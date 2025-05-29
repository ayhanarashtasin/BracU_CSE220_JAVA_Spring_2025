public static void InserFirst(ListNode head, int val){
        ListNode newNode = new ListNode(val);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        printLinkedList(head);
    }
