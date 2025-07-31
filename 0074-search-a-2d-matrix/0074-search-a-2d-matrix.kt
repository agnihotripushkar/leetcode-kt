class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val cols = matrix[0].size
        if (rows == 0) return false
    
        var left = 0 
        var right = rows*cols -1

        while(left <= right){
            val mid = left+ (right-left)/2
            val r =  mid/cols
            val c = mid % cols
            val midValue = matrix[r][c]

            when{
                midValue ==target -> return true
                midValue > target -> right = mid-1
                midValue < target -> left = mid + 1
            }
           
        }

        return false

    }
}