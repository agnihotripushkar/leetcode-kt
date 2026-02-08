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
    fun isSymmetric(root: TreeNode?): Boolean {
        if(root==null) return true
        return isMirror(root.left,root.right)  
    }

    fun isMirror(node1: TreeNode?,node2: TreeNode?):Boolean{
        if(node1==null && node2==null) return true
        if (node1 == null || node2 == null) return false

        return node1.`val` == node2.`val` 
            && isMirror(node1.left, node2.right) 
            && isMirror(node1.right, node2.left)
    }
}