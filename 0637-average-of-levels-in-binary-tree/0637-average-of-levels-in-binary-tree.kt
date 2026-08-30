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
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        if(root==null) return doubleArrayOf()

        val que = ArrayDeque<TreeNode>()
        val ans = mutableListOf<Double>()
        que.addLast(root)

        while(que.isNotEmpty()){
            val levelsize = que.size
            var temp = 0.0

            for(i in 0 until levelsize){
                val node = que.removeFirst()
				temp += (node.`val`)

                node.left?.let{ que.addLast(it)}

                if(node.right!=null){
                    que.addLast(node.right)
                }
            }

            val avg: Double = temp / levelsize
            ans.add(avg)
        }

        return ans.toDoubleArray()
        
    }
}