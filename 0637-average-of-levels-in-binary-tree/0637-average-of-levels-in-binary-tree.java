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
    public List<Double> averageOfLevels(TreeNode root) {
       
        
         List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            int n = size;
            long sum =0;
            while(size-->0)
            {
                TreeNode node = queue.remove();
                if(node.left!=null)
                queue.add(node.left);
                
                if(node.right!=null)
                    queue.add(node.right);
                
                sum += node.val;
            }
            
            double av=sum*1.0/n;
            list.add(av);
        }
        return list;
    
}
}