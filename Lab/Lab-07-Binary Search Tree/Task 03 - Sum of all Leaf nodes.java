public static Integer sumOfLeaves(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.elem;
        }
        return sumOfLeaves(root.left) + sumOfLeaves(root.right);
    }
