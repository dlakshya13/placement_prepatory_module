class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1);
        ListNode ptr = head;
        if(lists.length==0) return head.next;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((ListNode l1, ListNode l2)->l1.val-l2.val);
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)
                pq.add(lists[i]);
        }
        
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            ptr.next = new ListNode(node.val);
            if(node.next!=null)
                pq.add(node.next);
            ptr=ptr.next;
        }
        return head.next;
        
        
    }
}