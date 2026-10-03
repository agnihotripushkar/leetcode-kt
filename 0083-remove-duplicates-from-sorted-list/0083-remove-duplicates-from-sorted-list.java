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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev = head;
        Set<Integer> set = new HashSet<Integer>();
        if(prev!=null){
            set.add(prev.val);
        }
        ListNode root = head.next;

        while(prev.next!=null){
            if(set.contains(root.val)){
                prev.next = root.next;
                root.next = null;
                root = prev.next;
            }
            else{
                set.add(root.val);
                root = root.next;
                prev = prev.next;
            }
        }
        return head;
    }
}