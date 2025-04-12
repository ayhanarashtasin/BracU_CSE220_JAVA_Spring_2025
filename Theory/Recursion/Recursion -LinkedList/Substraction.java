static int subtraction(Node head, int index,int OddSum ,int Even_Multiplication){
    if(head==null){
      return Even_Multiplication-OddSum;
    }
    if(index%2==0){
      return subtraction(head.next,index+1,OddSum,Even_Multiplication*head.value);
    }
    if(index%2!=0){
      return subtraction(head.next,index+1,OddSum+head.value,Even_Multiplication);
    }
    return 0;
  }
}
