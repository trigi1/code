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
        int numNodes = 0;
        ListNode t = head;
        while(t != null) {
            numNodes++;
            t = t.next;
        }
        numNodes /= 2;
        for(int i = 0; i < numNodes; i++) {
            head = head.next;
        }
        return head;
    }
}
