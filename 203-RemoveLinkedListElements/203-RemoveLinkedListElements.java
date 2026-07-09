// Last updated: 7/9/2026, 9:50:58 AM
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
    public ListNode removeElements(ListNode head, int val) {
      ListNode ans=new ListNode(0,head);
      ListNode temp=ans;
      while(temp!=null && temp.next!=null){
        if(temp.next.val==val){
            temp.next=temp.next.next;
        }else{
            temp=temp.next;
        }
      }   
      return ans.next;
    }
}