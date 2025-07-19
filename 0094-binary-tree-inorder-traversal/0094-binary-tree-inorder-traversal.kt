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
    val result = mutableListOf<Int>()
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if(root!=null){
            travel(root)
        }
        return result
    }

    fun travel(root:TreeNode?){
        if(root!=null){
            travel(root.left)
            result.add(root.`val`)
            travel(root.right)
        }
    }
}