class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(i>0 && j>0){
                    grid[i][j] += minOf(grid[i-1][j], grid[i][j-1])    
                }
                else if(i>0){
                    grid[i][j] += grid[i-1][j]
                }
                else if(j>0){
                    grid[i][j] += grid[i][j-1]   
                }
            }
        }

        return grid[rows-1][cols-1]
        
    }
}