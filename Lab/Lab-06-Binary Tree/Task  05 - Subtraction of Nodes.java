public static Integer subtractSummation(Node root ){
        int left = sum(root.left);
        int right = sum(root.right);
        return left-right;
    }
    static int sum(Node root){
        if(root==null){
            return 0;
        }
        return sum(root.left) + sum(root.right) + root.data;
    }
