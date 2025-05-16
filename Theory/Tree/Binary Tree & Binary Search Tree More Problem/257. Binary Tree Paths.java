class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>pathlist = new ArrayList<String>();
        variousPathList(root,pathlist,"");
        return pathlist;
    }
    public void variousPathList(TreeNode root ,List<String>pathlist,String path){
        if(root==null){
            return;
        }
        if (path.isEmpty()) {
            path = Integer.toString(root.val);
        } else {
            path = path + "->" + root.val;
        }
        if(root.left==null && root.right==null){
            pathlist.add(path);
        }
        variousPathList(root.left,pathlist,path);
        variousPathList(root.right,pathlist,path);
        path = path.substring(0, path.length() - 1);
    }
}
