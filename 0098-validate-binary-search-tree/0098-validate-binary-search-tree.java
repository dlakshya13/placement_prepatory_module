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
    
    
    public boolean isValidBST(TreeNode root) {
        
        long i=Long.MIN_VALUE;
        long j=Long.MAX_VALUE;
     boolean f= check(root,i,j);
        return f;
        
    }
    
    public boolean check(TreeNode root,long i,long j)
    {
        if(root==null)
        {
            return true;
        }
        
        if(root.val<=i || root.val>=j)
        {
           return false;
        }
        
        
        return(check(root.left,i,root.val) && check(root.right,root.val,j));
        
       
       
    }
    
    
}