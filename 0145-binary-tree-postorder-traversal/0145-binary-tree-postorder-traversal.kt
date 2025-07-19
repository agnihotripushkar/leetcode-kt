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
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        travel(result,root)
        return result
    }

    fun travel(result:MutableList<Int>,root:TreeNode?){
        if (root==null) return
        travel(result,root.left)
        travel(result,root.right)
        result.add(root.`val`)
    }
}