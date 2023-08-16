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
          
     
       Queue<TreeNode> q = new LinkedList<>();
       
        List<Integer> s=new ArrayList<>();
         if(root==null)
        {
            return s;
        }
        q.add(root);
        
        
        while(!q.isEmpty())
        {
            
            int t1=q.size();
            for(int i=0;i<t1;i++)
            {
               TreeNode t=q.peek();
                q.remove();
                if(i==t1-1)
                {
                    s.add(t.val);
                    
                }
                if(t.left!=null)
                {
                    q.add(t.left);
                }
                if(t.right!=null)
                {
                    q.add(t.right);
                }
                
              
            }
            
                
            }
         return s;
            }
}