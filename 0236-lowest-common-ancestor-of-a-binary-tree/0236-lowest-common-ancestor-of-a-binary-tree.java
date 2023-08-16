/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         ArrayList<TreeNode> b1=new ArrayList<>();
    ArrayList<TreeNode> b2=new ArrayList<>();
        ntr(root,p,b1);
        ntr(root,q,b2);
        int i=b1.size()-1;
        int j=b2.size()-1;
        TreeNode k=null;
        while(i>=0&&j>=0)
        {
            if((b1.get(i).val)==(b2.get(j).val))
            {
                k=b1.get(i);
            }
            i--;
            j--;
        }
        
       return k;
    }
    
    ArrayList<TreeNode> a=new ArrayList<>();
    public boolean ntr(TreeNode root, TreeNode p,ArrayList<TreeNode> a)
    {
        if(root==null)
        {
            
            return false;
        }
        
        if(root==p)
        {
            a.add(p);
            return true;
        }
        boolean bol=ntr(root.left,p,a);
        if(bol)
        {
            a.add(root);
            return true;
        }
        boolean bool=ntr(root.right,p,a);
        if(bool)
        {
            a.add(root);
            return true;
        }
        return false;
    }
}