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
    TreeNode ans=new TreeNode();
    public void traverse(TreeNode node,TreeNode p, TreeNode q){
        if(node.val>p.val && node.val>q.val){
            traverse(node.left,p,q);
        }
        else if(node.val<p.val && node.val<q.val){
            traverse(node.right,p,q);
        }
        else{
            ans=node;
            return;
        }
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traverse(root,p,q);
        return ans;
    }
}
