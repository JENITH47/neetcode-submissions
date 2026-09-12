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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // List<Integer> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        if(root==null){
            sb.append("null");
            return sb.toString();
        }
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node==null){
                sb.append("null,");
                continue;
            }
            sb.append(node.val).append(",");
            queue.offer(node.left);
         queue.offer(node.right);
         }
         return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        int i=1;
        Queue<TreeNode> queue=new LinkedList<>();
        if(arr[0].equals("null")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            // if(node==null){
            //     continue;
            // }
            if(!arr[i].equals("null")){
            node.left=new TreeNode(Integer.parseInt(arr[i]));
            queue.offer(node.left);
            }
            i++;
            if(!arr[i].equals("null")){
            node.right=new TreeNode(Integer.parseInt(arr[i]));
            queue.offer(node.right);
            }
            i++;

        }
        return root;
        
    }
}
