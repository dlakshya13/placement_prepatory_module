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
   
    public int kthSmallest(TreeNode root, int k) 
    {
        ArrayList<Integer> a=new ArrayList<>();
    inorder(root,a);
      return a.get(k-1);
        
        
    }
    public void inorder(TreeNode root,ArrayList<Integer> a)
    {
          if(root==null)
            return ;
        
       inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
}