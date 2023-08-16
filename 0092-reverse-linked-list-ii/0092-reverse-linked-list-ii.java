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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        
    Stack<Integer> st=new Stack<>();
        ListNode t1=head;
        ListNode t2=head;
        int c=0;
        
        if(left==right)
        {
            return head;
        }
        for(int i=1;i<left;i++)
        {
            head=head.next;
            c++;
        }
        int s=c;
        int l=right-left;
        int m=l;
        while(l>=0)
        {
        st.push(head.val);
        head=head.next;
            l--;
        }
        
        for(int i=1;i<left;i++)
        {
            t2=t2.next;
        }
        
        
       for(int i=0;i<=m;i++)
        {
             
            t2.val=st.pop();
             t2=t2.next;
            
        }
        
        return t1;
        
        
        
        
        
    }
}


















