public static void smallestLevel(BTNode root, Integer[] levelArray, int lvl) {
    Queue<BTNode> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    int minimum = Integer.MAX_VALUE;
    int level = lvl;

    while (!q.isEmpty()) {
        BTNode currentNode = q.remove();
        if (currentNode == null) {
            levelArray[level] = minimum;
            minimum = Integer.MAX_VALUE;
            level++;
            if (q.isEmpty()) {
                break;
            } else {
                q.add(null);
            }
        } else {
            minimum = Math.min(minimum, currentNode.elem);

            if (currentNode.left != null) {
                q.add(currentNode.left);
            }
            if (currentNode.right != null) {
                q.add(currentNode.right);
            }
        }
    }
    for (int i = 0; i < level; i++) {
        System.out.print(levelArray[i] + " ");
    }
    System.out.println();
}

