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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> a=new ArrayList<>();
        return zigzag(root,a);
        
        
            
    }
    public List<List<Integer>> zigzag(TreeNode root, List<List<Integer>> a)
    {
        
        
        if(root==null)
        {
            return a;
        }
        int flag=0;
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
            if(flag%2==0)
            {
            a.add(s);
            }
            else
            {
                Collections.reverse(s);
                a.add(s);
                
            }
        flag++;
                
            }
         return a;

        }
}