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
    public TreeNode deleteNode(TreeNode root, int key) {
        ArrayList<Integer> a=new ArrayList<>();
        inorder(root,a);
        
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)==key)
            {
                a.remove(i);
                break;
            }
        }
        
        return del(a,0,a.size()-1);
        
        
    }
    public TreeNode del(ArrayList<Integer> aa,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        
        int m=(s+e)/2;
        TreeNode n=new TreeNode(aa.get(m));
        
        n.left=del(aa,s,m-1);
        n.right=del(aa,m+1,e);
        
        
        
        return n;
        
        
    }
    
    
    public void inorder(TreeNode root,ArrayList<Integer> a)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
    
    
    
    
    
}