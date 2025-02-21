public static void DeleteNthPosition(ListNode head,int pos){
        if (pos<0){
            printLinkedList(head);
            return;
        }
        if(pos==0){
            head = head.next;
            printLinkedList(head);
            return;
        }
        ListNode temp = head;
        for(int i=0; i<pos-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        printLinkedList(head);
    }
