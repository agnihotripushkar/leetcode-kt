/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        if(head?.next==null) return true

        var slow = head
        var fast = head

        while(fast?.next!=null && fast?.next?.next!=null){
            slow = slow?.next
            fast = fast?.next?.next
        }

        var curr = slow?.next
        var prev:ListNode? = null

        while(curr!=null){ 
            val nex = curr?.next
            curr.next = prev
            prev = curr
            curr = nex
        }

        var firstHalf = head
        var secondHalf = prev

        while(secondHalf!=null){
            if(firstHalf?.`val`!= secondHalf.`val`) return false
            firstHalf = firstHalf?.next
            secondHalf = secondHalf.next
        }

        return true
    }
}