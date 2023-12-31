
 import java.util.*;
 class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(0);
        ListNode smaller=smallerHead;
        ListNode largerHead = new ListNode(0);
        
        
        ListNode larger=largerHead;

        ListNode curr=head;

        while(curr!=null) {
            if(curr.val<x) {
                smaller.next=curr;
                smaller=smaller.next;
            }
            else {
                larger.next=curr;
                larger=larger.next;
                
            }
            curr=curr.next;
        }
        
        
        
        
        
        larger.next=null;
        
        smaller.next=largerHead.next;
        return smallerHead.next;
    }
}