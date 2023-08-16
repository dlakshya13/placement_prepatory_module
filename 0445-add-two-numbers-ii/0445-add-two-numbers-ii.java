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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        
        Stack<Integer> s3=new Stack<>();
        
        
        while(l1!=null)
        {
            s1.push(l1.val);
            l1=l1.next;
        }
        
        
         while(l2!=null)
        {
            s2.push(l2.val);
            l2=l2.next;
        }
        int c=0;
        
        
        while(!s1.empty() && !s2.empty())
        {
            
            int t=s1.pop()+s2.pop()+c;
            int t1=t%10;
            int t2=t/10;
            c = 0;
            if(t<10)
            {   
                s3.push(t);
            }
            else
            {
                s3.push(t1);
                c=c+t2;
                
            }
            
            
        }
        while(!s1.empty())
        {
            int t=s1.pop()+c;
            c=0;
            int t1=t%10;
            int t2=t/10;
            
            if(t<10)
            {
                s3.push(c+t);
                c=0;
            }
            else
            {
                s3.push(t1);
                c=c+t2;
                
            }
            
        }
        
        while(!s2.empty())
        {
            int t=s2.pop()+c;
            c=0;
            int t1=t%10;
            int t2=t/10;
            
            if(t<10)
            {
                s3.push(c+t);
                c=0;
            }
            else
            {
                s3.push(t1);
                c=c+t2;
                
            }
            
        }
        System.out.println(c);
        if(c!=0)
        {
            s3.push(c);
            c=0;
        }
        
        
        ListNode a=new ListNode(-1);
        ListNode b=a;
        while(!s3.empty())
        {
            ListNode n=new ListNode(s3.pop());
            b.next=n;
            b=b.next;
        }
        return a.next;
        
        
    }
}