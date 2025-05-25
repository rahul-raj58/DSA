/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     HashMap<ListNode, Integer> map = new HashMap<>();
    //     ListNode temp1 = headA;
        
    //     while(temp1 != null){
    //         map.put(temp1,1);
    //         temp1 = temp1.next;
    //     }
    //     ListNode temp2 = headB;
    //     while(temp2 != null){
    //         if(map.containsKey(temp2)){
    //             return temp2;
    //         }
    //         temp2 = temp2.next;
    //     }
    //     return null;


        // 2nd approach
        ListNode t1 = headA;
        ListNode t2 = headB; 
        int n1 = 0; 
        int n2 = 0;
        while(t1 != null){
            n1++;
            t1 = t1.next;
        }
        while(t2 != null){
            n2++;
            t2 = t2.next;
        }
        if(n1 < n2){
            return collisionPoint(headA,headB,n2-n1);
        }
        else{
            return collisionPoint(headB,headA,n1-n2);
        }

    }
    public ListNode collisionPoint(ListNode t1, ListNode t2, int diff){
        while(diff != 0){
            diff--;
            t2 = t2.next;
        }
        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}