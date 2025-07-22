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
        var ans = true

        fun DFS(root:TreeNode?):Int{
            if (root==null)return 0

            val left = DFS(root.left)
            val right = DFS(root.right)

            if (abs(left - right) >1){
                ans = false
            }

            return 1 + maxOf(right,left)
        }

         DFS(root)
         return ans   

        }

}