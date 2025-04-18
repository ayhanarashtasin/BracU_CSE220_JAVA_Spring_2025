    public static void Inorder(Node node){
        if(node==null){
            return;
        }
        Inorder(node.left);
        System.out.println(node.data + " ");
        Inorder(node.right);
    }
