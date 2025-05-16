class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>pathlist = new ArrayList<>();
        List<List<Integer>> Variouspathlist = new ArrayList<>();
        Pathsum(root,Variouspathlist,pathlist,targetSum);
        return Variouspathlist;
    }
    public static void Pathsum(TreeNode root,List<List<Integer>>Variouspathlist,List<Integer>pathlist,int targetSum){
        if(root==null){
            return;
        }
        pathlist.add(root.val);
        if(root.left==null && root.right==null && targetSum-root.val==0){
            Variouspathlist.add(new ArrayList<>(pathlist));
        }
        else{
            Pathsum(root.left,Variouspathlist,pathlist,targetSum-root.val);
            Pathsum(root.right,Variouspathlist,pathlist,targetSum-root.val);
        }
        pathlist.remove(pathlist.size()-1);
    }

}
