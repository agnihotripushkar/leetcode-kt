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
    fun generateTrees(n: Int): List<TreeNode?> {

        fun generate(left:Int, right:Int):List<TreeNode?>{
            val res = mutableListOf<TreeNode?>()
            if(left>right){
                res.add(null)
                return res
            }

            for(i in left..right){
                val leftTree = generate(left,i-1)
                val rightTree = generate(i+1,right)
                for (left in leftTree){
                    for(right in rightTree){
                        val root = TreeNode(i)
                        root.left = left
                        root.right = right
                        res.add(root)
                    }
                }
            }
            return res
        }

        return generate(1,n)
    }
}