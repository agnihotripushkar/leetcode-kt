class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val rows = matrix.size
        val cols = matrix[0].size
        var rowZero = false

        // capture all zero's
        for(i in 0 until rows){
            for(j in 0 until cols){
                if(matrix[i][j]==0){
                    matrix[0][j]=0
                    if (i>0) matrix[i][0]=0
                    else rowZero = true
                }
            }
        }

        // convert to zero's except the 1st box
        for(r in 1 until rows){
            for(c in 1 until cols){
                if(matrix[0][c]==0 || matrix[r][0]==0){
                    matrix[r][c]=0
                }
            }
        }

        // if first box is zero set entire 1st col to zero
        if(matrix[0][0]==0){
            for(r in 0 until rows){
                matrix[r][0] = 0
            }
        }

        // if bool is true then set entire 1st row to zero
        if(rowZero==true){
            for(c in 0 until cols){
                matrix[0][c]=0
            }
        }
    }
}