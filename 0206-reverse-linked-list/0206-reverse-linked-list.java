class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        //test code
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;        
    }
}