    public static int HeightOfBT(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(HeightOfBT(root.left),HeightOfBT(root.right)) + 1;
    }
    public static int DiameterofBT(Node root){
        if(root==null){
            return 0;
        }
        int left = DiameterofBT(root.left);
        int right = DiameterofBT(root.right);
        int diameter = HeightOfBT(root.left) + HeightOfBT(root.right)+1;

        return Math.max(diameter , Math.max(left,right));
    }
