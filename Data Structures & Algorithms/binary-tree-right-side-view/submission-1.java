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
        Deque<TreeNode> store=new ArrayDeque<>();
        store.offerFirst(root);
        while(!store.isEmpty()){
            // List<Integer> level=new ArrayList<>();
            int size=store.size();
            result.add(store.getLast().val);
            for(int i=0;i<size;i++){
                TreeNode node=store.pollFirst();
                // level.add(node.val);
                if(node.left!=null){
                    store.offerLast(node.left);

                }
                if(node.right!=null){
                    store.offerLast(node.right);
                }
            }
            // result.add(level.get(level.size()-1));
        }
        return result;

    }
}
