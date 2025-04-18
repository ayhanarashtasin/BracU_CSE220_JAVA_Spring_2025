    public static int SumOfNode(Node root){
        if(root==null){
            return 0;
        }
        return root.data + SumOfNode(root.left) + SumOfNode(root.right);
    }
