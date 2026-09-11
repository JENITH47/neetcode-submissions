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
    public TreeNode traverse(TreeNode node,int val){
        if(node==null){
            TreeNode a=new TreeNode(val);
        return a;
        }


        if( node.val>val){
           node.left= traverse(node.left,val);
        }
        if( node.val<val){
            node.right=traverse(node.right,val);
        }
        return node;
        
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        traverse(root,val);
        return traverse(root,val);
        
    }
}