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
    fun invertTree(root: TreeNode?): TreeNode? {
        val queue:Queue<TreeNode> = LinkedList<TreeNode>()
        if (root==null) return null
        queue.offer(root)

        while(queue.isNotEmpty()){
            val node = queue.poll()
            val temp = node.left
            node.left = node.right
            node.right = temp

            node.left?.let{queue.offer(it)}
            node.right?.let{queue.offer(it)}
        }
        return root
    }
}