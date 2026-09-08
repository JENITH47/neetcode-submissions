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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> result =new ArrayList<>();
        Queue<TreeNode> store=new LinkedList<>();
         if(root==null){
            return result;
        }
        store.add(root);
        
        while(!store.isEmpty()){
            int size=store.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<size;i++){
                currentLevel.add(store.peek().val);
                if(store.peek().left!=null){
                    store.add(store.peek().left);
                }
                if(store.peek().right!=null){
                    store.add(store.peek().right);
                }
                store.remove();
            }
            result.add(currentLevel);
        }
        return result;
        
    }
}
