    public static int CountOfNode(Node root){
        if(root==null){
            return 0;
        }
        return 1 + CountOfNode(root.left) + CountOfNode(root.right);
    }
