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
    private var mindiff = Int.MAX_VALUE
    private var prev:Int? = null

    fun getMinimumDifference(root: TreeNode?): Int {
        inorder(root)
        return mindiff
    }

    fun inorder(root:TreeNode?){
        if(root==null) return 
        inorder(root.left)
        prev?.let{it ->
            mindiff = Math.min(mindiff, root.`val` - it)
        }
        prev = root.`val`
        inorder(root.right)
    }
}