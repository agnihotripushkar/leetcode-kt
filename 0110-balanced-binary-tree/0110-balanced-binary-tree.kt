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

    fun isBalanced(root: TreeNode?): Boolean {
        if(root==null) return true
        var ans = true

        fun dfs(root:TreeNode?):Int{
            if(root==null) return 0

            val left = dfs(root.left)
            val right = dfs(root.right)

            if(abs(left - right)> 1){
                ans = false
            }

            return 1 + maxOf(left,right)
        }

        dfs(root)
        return ans  
    }

}