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
    int s=0;
    public int sumNumbers(TreeNode root) {
        
        fun(root,"");
        return s;
    }
    
    public void fun(TreeNode root,String str)
        {
        
        if(root==null)
        {           

            return ;
        }
        str=str+root.val;
        if(root.left==null && root.right==null)         {
             s=s+Integer.parseInt(str);
         return;
            
            
       }
        
        
        fun(root.left,str);
        fun(root.right,str);
        
        
        
    }
    
}