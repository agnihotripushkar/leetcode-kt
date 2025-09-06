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
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val result = mutableListOf<String>()
        DFS(root,"",result)
        return result
    }

    fun DFS(root:TreeNode?, path:String, result:MutableList<String>){
        if(root==null)return

        var currPath = path 
        currPath +=root.`val`

        if(root.left==null && root.right==null){
            result.add(currPath)
            return
        }
        else{
            currPath +="->"
            DFS(root.left,currPath,result)
            DFS(root.right,currPath,result)
        }
    }
}