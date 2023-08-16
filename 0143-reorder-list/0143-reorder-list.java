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
    public void reorderList(ListNode head) {
        
        ListNode t1=head;
        ListNode t2=head;
        
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        int c=0;
        
        
        while(t1!=null)
        {
            c++;
            q.add(t1.val);
            s.push(t1.val);
                
            
            t1=t1.next;
        }
        
        int m=0;
        while(t2!=null)
        {
            if(m%2==0)
            {
            t2.val=q.remove();
            }
            else
            {
                t2.val=s.pop();
            }
            m++;
            t2=t2.next;
            
        }
        
        
        
        
        
        
    }
}