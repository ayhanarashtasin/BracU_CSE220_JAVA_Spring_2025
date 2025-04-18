    public static void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
