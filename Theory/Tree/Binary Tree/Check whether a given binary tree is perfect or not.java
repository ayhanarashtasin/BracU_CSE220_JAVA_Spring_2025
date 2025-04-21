Public static boolean isPerfect(Node root) {
        
        if (root == null) return true;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int nodeCnt = 1;
        
        while (!q.isEmpty()) {
            int size = q.size();
            if (size != nodeCnt) return false;
            
            while (size-- > 0) {
                Node curr = q.poll();
                
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            nodeCnt *= 2;
        }
        return true;
    }
