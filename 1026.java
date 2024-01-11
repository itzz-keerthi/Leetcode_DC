/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxAncestorDiff(TreeNode root) {
       if(root==null){
           return 0;
       }
       int min=root.val,max=root.val;
       maxdiff(root,min,max);
       return maxdiff;
    }
    int maxdiff=0;
    public void maxdiff(TreeNode root,int min,int max){
        if(root==null){
            return;
        }
        maxdiff=Math.max(maxdiff,Math.max(Math.abs(min-root.val),Math.abs(max-root.val)));
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);
        maxdiff(root.left,min,max);
        maxdiff(root.right,min,max);
    }

}
