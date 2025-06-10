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
        var currentL1 = l1 // Use mutable variables to traverse the lists
        var currentL2 = l2
        var carry =0
        val dummyhead = ListNode(0)
        var root = dummyhead

        while(currentL1!=null || currentL2!=null || carry!=0){
            val val1 = currentL1?.`val` ?: 0
            val val2 = currentL2?.`val` ?: 0

            var sum = val1 + val2 + carry
            
            carry = sum / 10
            sum = sum % 10
            
            root.next =ListNode(sum)
            root = root.next

            currentL1 = currentL1?.next
            currentL2 = currentL2?.next
        }

        return dummyhead.next
        
    }
}