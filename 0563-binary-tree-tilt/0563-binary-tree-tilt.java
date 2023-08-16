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
    
    int t=0;
    public int findTilt(TreeNode root)
    {
        fun(root);
        return t;
        
    }
    public int fun(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int m=fun(root.left);
        int n=fun(root.right);
        t=t+Math.abs(m-n);
        return m+n+root.val;
    }
    
    
    
    
}