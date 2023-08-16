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
    public ListNode removeElements(ListNode head, int val) {
        
        
        if(head==null)
        {
            return head;
            
        }
        
        ListNode an=head;
        if(head.next==null)
        {
            if(head.val==val)
            {
                head=head.next;
            }
            return head;
        }
        
        
    
        
        while(head.next!=null)
        {
            if(head.next.val==val)
            {
                head.next=head.next.next;
            }
            else
            {
                head=head.next;
            }
        }
        
        if(an.val==val)
        {
            an=an.next;
        }
        
        return an;
        
    }
}