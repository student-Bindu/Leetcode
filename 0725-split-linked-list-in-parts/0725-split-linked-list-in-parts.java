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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0; 
        for(ListNode curr = head; curr != null; curr = curr.next){
            len++;
        }
        ListNode result[] = new ListNode[k];
        int extras = len % k, equals = len / k, indx = 0, size = 0;
        ListNode currHead = head, currTail = null, curr = head;
        for(; indx < extras; indx++){
              while(curr != null && size < equals + 1){
                  if(currHead == null)currHead = curr;
                  currTail = curr;
                  curr = curr.next;
                  size++;
              }
              result[indx] = (size > 0) ? currHead : null;
              if(currTail != null){
                  ListNode next = currTail.next;
                  currTail.next = null;
                  curr = next;
                   size = 0; 
              }
              currHead = null;
        }
        for(indx = extras; indx < k; indx++){
             while(curr != null && size < equals){
                  if(currHead == null)currHead = curr;
                  currTail = curr;
                  curr = curr.next;
                  size++;
              }
              result[indx] = (size > 0) ? currHead : null;
              if(currTail != null){
                  ListNode next = currTail.next;
                  currTail.next = null;
                  curr = next;
                  size = 0;
              }
              currHead = null;
        }
        return result;
    }
}