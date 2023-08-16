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
class Solution {
    public boolean isPalindrome(ListNode head) {
         ListNode temp=head;
        
        
        int f=0;
        boolean ans=true;
        Stack<Integer> st=new Stack<>();
        while(temp!=null)
        {
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode t=head;
        int c=0;
        while(t!=null)
        {
            c=st.pop();
            if(c!=t.val)
            {
                f=1;
                break;
            }
            
            t=t.next;
        }
        if(f==1)
        {
           return false; 
        }
        return true;
    }
}