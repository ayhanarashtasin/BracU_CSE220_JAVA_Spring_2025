static void Sum_recursive(Node head,int sum){
    if (head == null){
      System.out.println(sum);
      return;
    }
    Sum_recursive(head.next,sum+head.value);
  }
}
