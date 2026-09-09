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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> store=new LinkedList<>();
        store.offer(root);
        while(!store.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int size=store.size();
            for(int i=0;i<size;i++){
                TreeNode node=store.poll();
                level.add(node.val);
                if(node.left!=null){
                    store.offer(node.left);

                }
                if(node.right!=null){
                    store.offer(node.right);
                }
            }
            result.add(level.get(level.size()-1));
        }
        return result;

    }
}
