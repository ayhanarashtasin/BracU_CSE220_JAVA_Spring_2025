public static Integer lowestCommonAncestor(Node root, Integer x, Integer y ){
        if(root==null){
            return null;
        }
        if(x>root.elem && y>root.elem){
            return lowestCommonAncestor(root.right,x,y);
        }
        if(x<root.elem && y<root.elem){
            return lowestCommonAncestor(root.left,x,y);
        }
        return root.elem;
    }
