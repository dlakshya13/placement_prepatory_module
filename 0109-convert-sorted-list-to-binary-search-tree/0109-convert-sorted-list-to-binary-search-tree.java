/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
          
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null)
        {
            a.add(head.val);
            head=head.next;
        }
        int i=0;
        int j=a.size()-1;
        return fun(a,i,j);
        
    }
    
    private TreeNode fun(ArrayList<Integer> a,int i,int j)
    {
        if(i>j)
        {
            return null;
        }
        int mid=(i+j)/2;
        int t=a.get(mid);
        
        TreeNode t1=new TreeNode(t);
        t1.left=fun(a,i,mid-1);
        t1.right=fun(a,mid+1,j);
        return t1;
        
        
        
    }
    
    
    
}