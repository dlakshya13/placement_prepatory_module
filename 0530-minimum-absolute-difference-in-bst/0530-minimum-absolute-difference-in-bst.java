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
    public int getMinimumDifference(TreeNode root) {
        
     ArrayList<Integer> a=new ArrayList<>();
       
        fun(root,a);
                        
      int[] b=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            b[i]=a.get(i);
        }
        Arrays.sort(b);
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<a.size()-1;i++)
        {
            if((b[i+1]-b[i])<ans)
            {
                ans=b[i+1]-b[i];
            }
        }
        
    return ans;
        
        
    }
    
    public void fun(TreeNode root,ArrayList<Integer> a)
    {
        if(root==null)
        {
            return;
        }
        fun(root.left,a);
        a.add(root.val);
        fun(root.right,a);
        
    }
    
    
}