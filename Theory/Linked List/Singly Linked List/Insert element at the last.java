public static void InsertLast(ListNode head, int val){
        ListNode newNode = new ListNode(val);
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        printLinkedList(head);
    }
