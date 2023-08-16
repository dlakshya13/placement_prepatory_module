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
    
     
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> b=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        fun(root,targetSum,0,a,b);
        return b;
        
    }
    
    
    public void fun(TreeNode root,int targetSum,int cs,List<Integer> a,List<List<Integer>> b)
    {
        

        
        if(root==null)
        {
            return ;
        }
      
        cs=cs+root.val;
          a.add(root.val);
        if(root.left==null && root.right==null && cs==targetSum)
        {
            b.add(new ArrayList<>(a));
        }
        
        
        fun(root.left,targetSum,cs,a,b);
        fun(root.right,targetSum,cs,a,b);
        a.remove(a.size()-1);
        
        
    }
    
    
    
}