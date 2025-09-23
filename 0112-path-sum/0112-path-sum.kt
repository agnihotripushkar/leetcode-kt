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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        
        fun DFS(node:TreeNode?, target:Int):Boolean{
            if (node == null) {
                return false
            }

            if(node.left==null && node.right==null && target== node.`val`){
                return true
            }
            return DFS(node.left,target-node.`val`) || DFS(node.right, target-node.`val`)
        }

        return DFS(root,targetSum)
        
    }
}