static boolean isCompleteBinaryTree(Node root) {
        if (root == null) {
            return true;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean nullEncountered = false;

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr == null) {
                nullEncountered = true;
            } 
            else {
                if (nullEncountered) {
                    return false;
                }
                q.add(curr.left);
                q.add(curr.right);
            }
        }

        return true;
    }
