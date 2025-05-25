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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        temp = head;
        int mid = (count/2)+1;
        while(temp != null){
            mid--;
            if(mid == 0){
                break;
            }
            temp = temp.next;
        }
        return temp;

        // ListNode slow = head; 
        // ListNode fast = head; 
        // while(fast != null && fast.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next;

        // }
        // return slow;
        
        
        
    }
}