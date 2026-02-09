/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun balanceBST(root: TreeNode?): TreeNode? {
        val inOrderList = ArrayList<Int>()

        fun inOrder(root:TreeNode?){
            if(root==null) return
            inOrder(root.left)
            inOrderList.add(root.`val`)
            inOrder(root.right)
        }
        
        fun createBST(inOrderList:ArrayList<Int>, start:Int, end:Int):TreeNode?{
            if(start > end) return null
            val mid = start + (end-start)/2
            val node = TreeNode(inOrderList[mid])
            node.left = createBST(inOrderList, start, mid-1)
            node.right = createBST(inOrderList,mid+1,end)
            return node
        }
        
        inOrder(root)
        return createBST(inOrderList,0,inOrderList.size-1)
        
    }
}