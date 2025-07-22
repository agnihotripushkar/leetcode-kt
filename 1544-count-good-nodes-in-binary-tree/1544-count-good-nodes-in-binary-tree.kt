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
    fun goodNodes(root: TreeNode?): Int {
        var count = 0
        if (root==null) return count

        fun dfs(root:TreeNode?,currMax:Int){
            if (root==null)return
            if(root.`val`>= currMax){
                count++
            }
            var newMax = maxOf(currMax,root.`val`)
            dfs(root.left,newMax)
            dfs(root.right, newMax)
        }

        dfs(root,Int.MIN_VALUE)
        return count
        
    }
}