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
    public ListNode reverseList(ListNode head) {
        // iterative --> appraoch 1(using stack)

        // ListNode temp = head;
        // Stack<Integer> st = new Stack<>();
        // while(temp != null){
        //     st.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head; 
        // while(temp != null){
        //     temp.val = st.pop();
            
        //     temp = temp.next;
        // }
        // return head;

        // iterative --> appraoch 2

        // ListNode temp = head;
        // ListNode prev = null;
        // while(temp != null){
        //     ListNode front = temp.next; 
        //     temp.next = prev;
        //     prev = temp; 
        //     temp = front; 
        // }
        // return prev;

        // recursive

    if(head == null || head.next == null){
        return head;
    }
    ListNode newHead = reverseList(head.next);
    ListNode front = head.next;
    front.next = head;
    head.next = null;
    return newHead;

        
    }
}