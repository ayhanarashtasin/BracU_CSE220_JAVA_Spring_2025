public static void convertMirror(BTNode root ){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int minimum = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            BTNode currentNode = q.remove();
            if(currentNode==null){
                System.out.println(minimum);
                minimum = Integer.MAX_VALUE;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                minimum = Math.min(minimum,currentNode.elem);

                if(currentNode.left !=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right !=null){
                    q.add(currentNode.right);
                }
            }
        }
    }
