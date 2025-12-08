static int subtraction(Node head, int OddSum ,int Even_Multiplication){
    if(head==null){
      return abs(Even_Multiplication-OddSum);
    }
    if(head.value%2==0){
      return subtraction(head.next,OddSum,Even_Multiplication*head.value);
    }
    if(head.value%2!=0){
      return subtraction(head.next,OddSum+head.value,Even_Multiplication);
    }
    return 0;
  }
}
