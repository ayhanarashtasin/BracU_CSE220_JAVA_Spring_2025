public static Integer mirrorSum(Node root ){
        if(root==null){
            return 0;
        }
        return MIRRORSUM(root.left,root.right);
    }
    public static Integer MIRRORSUM(Node Left , Node Right){
        if(Left==null || Right==null){
            return 0;
        }
        return Left.elem + Right.elem + MIRRORSUM(Left.left,Right.right) + MIRRORSUM(Left.right,Right.left);
    }
