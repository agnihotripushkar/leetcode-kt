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
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        var ans = 0

        fun dfs(root:TreeNode?):Int{
            if(root==null){
                return 0
            }

            val left = dfs(root.left)
            val right = dfs(root.right)

            ans = maxOf(ans, left+right)
            return 1 + maxOf(left,right)
        }

        dfs(root)
        return ans
    }
}