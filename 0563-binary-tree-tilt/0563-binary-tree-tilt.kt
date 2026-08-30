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
    private var total = 0

    fun findTilt(root: TreeNode?): Int {
        total = 0
        DFS(root)
        return total
    }

    fun DFS(root:TreeNode?):Int{
        if(root==null) return 0
        val leftSum = DFS(root.left)
        val rightSum = DFS(root.right)
        val tilt = Math.abs(leftSum - rightSum)
        total += tilt
        return root.`val` + leftSum + rightSum
    }
}