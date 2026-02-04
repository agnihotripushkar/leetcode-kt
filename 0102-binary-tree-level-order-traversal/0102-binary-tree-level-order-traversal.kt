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
        val que = ArrayDeque<TreeNode>()
        val result = mutableListOf<List<Int>>()

        if(root==null){
            return result
        }

        que.addLast(root)

        while(que.isNotEmpty()){
            val size = que.size
            val tempArr = ArrayList<Int>(size)

            for(i in 0 until size){
                val node = que.removeFirst()
                tempArr.add(node.`val`)
                if(node.left!=null){
                    que.addLast(node.left)
                }
                if(node.right!=null){
                    que.addLast(node.right)
                }
            }
            result.add(tempArr)
        }

        return result
    }
}