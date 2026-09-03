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
    public static List<Integer> Traversal(List a,TreeNode node){
        if(node==null){
            return a;
        }
        Traversal(a,node.left);
        a.add(node.val);
        Traversal(a,node.right);
        // a.add(node.val);
        return a;
        
    } 
    public List<Integer> inorderTraversal(TreeNode root) {
        List ans=new ArrayList<Integer>();
       ans= Traversal(ans,root);
       return ans;

    }
}