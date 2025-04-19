public static Integer sumTree(BTNode root ){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int count=0;
        int sum = root.elem;
        while(!q.isEmpty()){
            BTNode currentNode = q.remove();
            if(currentNode==null){
                count+=1;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(count!=0){
                    sum+=(currentNode.elem%count);
                }

                if(currentNode.left !=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right !=null){
                    q.add(currentNode.right);
                }
            }
        }
        return sum;
    }
