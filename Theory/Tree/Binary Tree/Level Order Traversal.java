    public static void LevelorderTraversal(Node node){
        if(node==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while(!q.isEmpty()){
            Node currentNode = q.remove();
            if(currentNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.println(currentNode.data + " ");
                if(currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
        }
    }
