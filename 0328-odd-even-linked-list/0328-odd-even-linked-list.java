class Solution 
{
    public ListNode oddEvenList(ListNode head) 
    {
        if(head == null || head.next == null) return head;

        ListNode odd = head, even = head.next, evenhead = head.next;
        while(odd.next != null && even.next != null)
        {
            odd.next = even.next;
            even.next = odd.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        
        return head;
    }
}