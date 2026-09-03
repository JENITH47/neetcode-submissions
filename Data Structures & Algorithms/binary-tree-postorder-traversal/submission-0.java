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
    public List<Integer> traversal(List a,TreeNode root){
        if(root==null){
            return a;
        }
        traversal(a,root.left);
        traversal(a,root.right);
        a.add(root.val);
        return a;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List ans=new ArrayList<Integer>();
        return traversal(ans,root);
    }
}