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
    int max=Integer.MIN_VALUE;
    int x=0;
    public int traverse(TreeNode node){
        if(node==null){

            return 0;
        }
        int left=traverse(node.left);
        left=Math.max(0,left);

        int right=traverse(node.right);
        right=Math.max(0,right);
        int path=left+right+node.val;
        x=Math.max(left,right)+node.val;
        if(path>max){
            max=path;
        }
        return x;

    }
    public int maxPathSum(TreeNode root) {
        
        traverse(root);
        return max;
    }
}
