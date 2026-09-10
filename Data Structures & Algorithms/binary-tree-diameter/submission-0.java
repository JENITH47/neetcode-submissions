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
    int height=0;
    public int depth(TreeNode node){
        if(node == null){
            return 0;
        }
        int left=depth(node.left);
        int right=depth(node.right);
        int hei=left+right;
        height=Math.max(height,hei);
        return Math.max(left,right)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return height;
    }
}
