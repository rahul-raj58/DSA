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
    public ListNode oddEvenList(ListNode head) {
        // if(head == null || head.next == null){
        //     return head;
        // }
        // // odd index(1,3,5....)
        // ListNode temp = head; 
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // while(temp != null && temp.next != null){
        //     arr.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp != null){                
        //     arr.add(temp.val);
        // }
        // temp = head.next;
        // while(temp != null && temp.next != null){
        //     arr.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp != null){
        //     arr.add(temp.val);
        // }
        // temp = head;
        // int i = 0;
        // while(temp != null){
        //     temp.val = arr.get(i);
        //     i++;
        //     temp = temp.next;
        // }
        // return head;


        // 2nd approach
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head; 
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;

    }
}