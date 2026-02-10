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
    private var first: TreeNode? = null
    private var second: TreeNode? = null
    private var prev: TreeNode? = null

    fun recoverTree(root: TreeNode?): Unit {
        inOrder(root)
        if(first!=null && second!=null){
            val temp = first!!.`val`
            first!!.`val` = second!!.`val`
            second!!.`val` = temp
        }
    }

    private fun inOrder(root:TreeNode?){
            if(root==null)return
            inOrder(root.left)

            if(prev!=null && prev!!.`val`>root.`val`){
                if(first==null){
                    first = prev
                }
                second = root
            }

            prev = root
            inOrder(root.right)
        }
}