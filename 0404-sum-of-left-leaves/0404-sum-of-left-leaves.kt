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
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        return dfs(root,0,false);


        
    }

    fun dfs(root:TreeNode?,amount:Int,isLeft:Boolean):Int{
        if(root==null) return amount;
        if(root.left==null && root.right==null && isLeft){
            return amount + root.`val`;
        }
        val leftAmount = dfs(root.left,amount,true);
        val rightAmount = dfs(root.right,amount,false);
        return leftAmount + rightAmount;
        }
}