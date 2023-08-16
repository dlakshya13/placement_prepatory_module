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
     public int length(ListNode a)
    {
        int c=0;
        while(a!=null)
        {
            a=a.next;
            c++;
        }
        return c;
    }
    public ListNode reverseKGroup(ListNode head,int k,int l)
    {
        if(l<k)
        {
            return  head;
        }
        int count=0;
        ListNode pre=null;
        ListNode curr=head;
        ListNode nex=null;
        while(count<k && curr!=null)
        {
            nex=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nex;
            count++;
        }
        
        if(nex!=null)
        {
        head.next=reverseKGroup(nex,k,l-k);
        }
        return pre;
         
        
    }
        
    public ListNode reverseKGroup(ListNode head, int k) {
     int l=length(head);
        return reverseKGroup(head,k,l);
        
    }
    
    
    
    
}