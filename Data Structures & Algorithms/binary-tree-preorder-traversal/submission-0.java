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
    public List<Integer> traversal(List a,TreeNode node){
        if(node==null){
            return a;
        }
        a.add(node.val);
        traversal(a,node.left);
        traversal(a,node.right);
        // return left.add(right);
        return a;

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List ans=new ArrayList<Integer>();
        ans=traversal(ans,root);
        return ans;
    }
}