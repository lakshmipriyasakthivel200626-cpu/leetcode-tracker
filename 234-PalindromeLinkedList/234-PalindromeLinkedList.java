// Last updated: 7/9/2026, 9:50:45 AM
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
    public ListNode middleNode(ListNode h1) {
    ListNode fast=h1;
    ListNode slow=h1;
    while(fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }    
    if(fast.next!=null) return slow.next;
    return slow;
    }
public boolean isPalindrome(ListNode h1) {
        ListNode original=h1;
         ListNode h2=null;
     while(h1!=null){
        ListNode temp=new ListNode(h1.val);
 temp.next=h2;
 h2=temp;
 h1=h1.next;
 
     } 
     while(original!=null && h2!=null){
      if(original.val != h2.val){
        return false;
     }
    original =original.next;
    h2=h2.next;
     }
     return true;
    }
}