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
     
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> tree1_res=new ArrayList<>();
        List<Integer> tree2_res=new ArrayList<>();
        tree1(root1,tree1_res);
        tree2(root2,tree2_res);

        return tree1_res.equals(tree2_res);
    }
    public static List<Integer> tree1(TreeNode root,List<Integer> res){
        if(root==null){
            return res;
        }
        tree1(root.left,res);
        if(root.left==null && root.right==null){
        res.add(root.val);
        }
        tree1(root.right,res);
        System.out.print(res);
        return res;
    }
    public static List<Integer> tree2(TreeNode root,List<Integer> res){
        if(root==null){
            return res;
        }
        tree2(root.left,res);
        if(root.left==null && root.right==null){
        res.add(root.val);
        }
        tree2(root.right,res);
        System.out.print(res);
        return res;
    }
}
