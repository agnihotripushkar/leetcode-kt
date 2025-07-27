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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if(list1==null){
            return list2
        }

        if(list2==null){
            return list1
        }

        val dummyHead = ListNode(0)
        var current:ListNode? = dummyHead

        var p1 = list1
        var p2 = list2


        while(p1!=null && p2!=null){
            if(p1.`val`<=p2.`val`){
                current?.next = p1
                p1 = p1.next
            }
            else{
                current?.next = p2
                p2 = p2.next
            }
            current = current?.next
        }

        if (p1 ==null){
            current?.next = p2
        }

        if (p2 ==null){
            current?.next = p1
        }

        return dummyHead.next
    
    }
}