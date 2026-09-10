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
    int check=0;
    public void tree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return;
        }
        if((p==null && q!=null)||(p!=null&& q==null)||p.val!=q.val){
            check=1;
            return;
        }
        
        tree(p.left,q.left);
        tree(p.right,q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        tree(p,q);
        if(check==1){
            return false;
        }
        return true;
    }
}
