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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head; 
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(count == n){
            ListNode newHead = head.next;
            return newHead;
        }
        int delCount = count - n; 
        temp = head;
        while(temp != null){
            delCount--;
            if(delCount == 0){
                break;
            }
            temp = temp.next;
        }
        ListNode delNode = temp.next;
        temp.next = temp.next.next;
        return head;
    }
}