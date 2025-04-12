static int maximum_number(Node head,int maximum){
    if(head == null){
      return maximum;
    }
    if(head.value > maximum){
      maximum = head.value;
    }
    return maximum_number(head.next,maximum);
  }
}
