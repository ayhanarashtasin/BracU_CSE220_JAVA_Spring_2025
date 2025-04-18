    public static int HeightOfBT(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(HeightOfBT(root.left),HeightOfBT(root.right)) + 1;
    }
