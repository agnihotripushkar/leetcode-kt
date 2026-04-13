class Solution {
    fun checkValid(matrix: Array<IntArray>): Boolean {
        val n = matrix.size

        for(i in 0 until n){
            val rowBool = BooleanArray(n+1)
            val colBool = BooleanArray(n+1)

            for(j in 0 until n){
                val row = matrix[i][j]
                val col = matrix[j][i]

                if(rowBool[row] || colBool[col]){
                    return false
                }
                rowBool[row] = true
                colBool[col] = true

            }

        }

        return true
        
    }
}