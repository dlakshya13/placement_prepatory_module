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
    int max=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
      int m=fun(root);
        return max;
        
    }
    
    public int fun(TreeNode root)
    {
          if(root==null)
        {
            return 0;
        }
        int lh=fun(root.left);
        int rh=fun(root.right);
        max=Math.max(max,lh+rh);
        return Math.max(lh,rh)+1;
    }
    
    
}