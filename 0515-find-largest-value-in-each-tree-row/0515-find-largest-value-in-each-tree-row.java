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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        
        if(root==null)
        {
            return a;
        }
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            int t=Integer.MIN_VALUE;
            int m=q.size();
            for(int i=1;i<=m;i++)
            {
                if(q.peek().left!=null)
                {
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null)
                {
                    q.add(q.peek().right);
                }
                if(q.peek().val>t)
                {
                    t=q.peek().val;
                }
                
                q.remove();
            }
            a.add(t);
        }
        
        return a;
            
        
        
        
    }
}