    public static BTNode convertMirror(BTNode root ){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            BTNode currentNode = q.poll();
  
            BTNode temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right=temp;

            if(currentNode.left !=null){
                q.add(currentNode.left);
            }
            if(currentNode.right !=null){
                q.add(currentNode.right);
            }

        }
        return root;
    }
