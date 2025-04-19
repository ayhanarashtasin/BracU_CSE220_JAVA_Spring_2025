public static void swapChild(BTNode root, int lvl, int M ){
        if(root==null){
            return;
        }
        swapChild(root.left , lvl+=1 , M);
        swapChild(root.right , lvl+=1 , M);

        if(lvl>=M){
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
