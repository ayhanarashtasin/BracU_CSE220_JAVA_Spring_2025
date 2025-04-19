public static Integer levelSum(BTNode root ){
        if(root==null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int count=1;
        int sum = 0;
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
                if(count%2!=0){
                    sum-=currentNode.elem;
                }
                if(count%2==0){
                    sum+=currentNode.elem;
                }
                if(currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
        }
        return sum;
    }
