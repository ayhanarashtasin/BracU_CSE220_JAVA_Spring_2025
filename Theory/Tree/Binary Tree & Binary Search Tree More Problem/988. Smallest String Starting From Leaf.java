class Solution {
    private String smallest = "~";
    
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder s = new StringBuilder();
        string(root, s);
        return smallest;
    }
    
    public void string(TreeNode root, StringBuilder s) {
        if(root == null) {
            return;
        }
        s.append((char)(root.val + 'a'));
        if(root.left == null && root.right == null) {
            String current = s.reverse().toString();
            if(current.compareTo(smallest) < 0) {
                smallest = current;
            }
            s.reverse();
        }
        
        string(root.left, s);
        string(root.right, s);
        s.deleteCharAt(s.length() - 1);
    }
}
