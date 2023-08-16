/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head==null || head.next==null){
        return null;
    }
        ListNode s=head;
        ListNode f=head;
            s = s.next;
  f = f.next.next;
        while(f!=null && f.next!=null)
        {
            if(s==f)
            {
                break;
            }
            s=s.next;
            f=f.next.next;
            
        }
    
        if(s!=f)
        {
            return null;
        }
        else
        {
            s=head;
            while(s!=f)
            {
                s=s.next;
                f=f.next;
            }
        }
        return s;
        
    }
}