class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        val size = mat.size
        var sum = 0

        for(i in 0 until size){
            sum += mat[i][i]
            sum += mat[i][size-1-i]
        }

        if(size%2!=0){
           sum  -= mat[size/2][size/2]
        }

        return sum
        
    }
}