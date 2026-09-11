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
    int index=0;
    public TreeNode build(TreeNode node,int[] preorder, int[] inorder,int start,int end){
        if(start>end){
            return null;
        }
        node=new TreeNode(preorder[index]);
        index++;
        int i=start;
        while(node.val!=inorder[i]){
            i++;
        }
        node.left=build(node.left,preorder,inorder,start,i-1);
        node.right=build(node.right,preorder,inorder,i+1,end);
        return node;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=new TreeNode();
        return build(root, preorder,  inorder,0,inorder.length-1);
        

    }
}
