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
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> a=new ArrayList<>();
        a=lev(root,a);
        
        return a.get(a.size()-1).get(0);
    }
    
    
    
     public List<List<Integer>> lev(TreeNode root, List<List<Integer>> a)
    {
        if(root==null)
        {
            return a;
        }
       Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> s=new ArrayList<>();
            int t=q.size();
            for(int i=1;i<=t;i++)
            {
                if(q.peek().left!=null)
                {
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null)
                {
                    q.add(q.peek().right);
                }
                s.add(q.remove().val);
              
            }
            a.add(s);
                
            }
         return a;
        }
}