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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var currL1 = l1
        var currL2 = l2
        var carry = 0

        val dummy = ListNode(0)
        var root = dummy

        while(currL1!=null || currL2!=null || carry!=0){
            val add1 = currL1?.`val`?:0
            val add2 = currL2?.`val`?:0
            var sum = add1 + add2 + carry

            carry = sum /10
            sum = sum % 10

            root.next = ListNode(sum)

            currL1 = currL1?.next
            currL2 = currL2?.next
            root = root.next

        }

        return dummy.next
        
    }
}