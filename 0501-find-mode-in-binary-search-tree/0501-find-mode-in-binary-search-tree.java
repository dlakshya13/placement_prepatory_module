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
    HashMap<Integer,Integer> hm=new HashMap<>();
    public int[] findMode(TreeNode root) {
        
        check(root);
        
        Integer max=Integer.MIN_VALUE;
        for(int i:hm.keySet())
        {
            if(hm.get(i)>max)
            {
                max=hm.get(i);
                
            }
        }
        
        List<Integer> a=new ArrayList<>();
        
        for(int i:hm.keySet())
        {
            if(hm.get(i)==max)
            {
                a.add(i);
            }
            
        }
        
        
       int[] ans=new int[a.size()];
        
        for(int i=0;i<a.size();i++)
        {
            ans[i]=a.get(i);
        }
        
        return ans;
        
            
        
        
    }
    public void check(TreeNode root)
    {
        
        if(root==null)
        {
            return ;
        }
        
        if(!hm.containsKey(root.val))
        {
            hm.put(root.val,1);
        }
        else
        {
            int of=hm.get(root.val);
            
            hm.put(root.val,of+1);
            
        }
        
        check(root.left);
        check(root.right);
        
    }
    
}