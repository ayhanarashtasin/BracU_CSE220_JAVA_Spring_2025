    public static void PostOrder(Node node){
        if(node==null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.data + " ");
    }
