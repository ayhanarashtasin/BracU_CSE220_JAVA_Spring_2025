class Solution {
    public int sumNumbers(TreeNode root) {
        return sumN(root,0);
    }
    public int sumN(TreeNode root,int value){
        if(root==null){
            return 0;
        }
        value = value*10 + root.val;
        if(root.left==null && root.right==null){
            return value;
        }
        return sumN(root.left,value) + sumN(root.right,value);
    }
}
