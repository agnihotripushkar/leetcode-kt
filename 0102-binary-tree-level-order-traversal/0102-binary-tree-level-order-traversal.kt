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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        if (root==null) return res
        val queue:Queue<TreeNode> = LinkedList<TreeNode>()
        queue.offer(root)

        while(queue.isNotEmpty()){
            val size = queue.size
            val nodeList = mutableListOf<Int>()

            for(i in 0 until size){
                val node = queue.poll()
                nodeList.add(node.`val`)

                node.left?.let{queue.offer(it)}
                node.right?.let{queue.offer(it)}
            }
            res.add(nodeList)
        }

        return res
    }
}