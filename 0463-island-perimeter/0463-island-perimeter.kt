class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var peri = 0
        
        for(i in 0 until rows){
            for(j in 0 until cols){
                if(grid[i][j]==1){
                    // top or nei
                    if(i==0 || grid[i-1][j]==0)peri++
                    // bottom or nei
                     if(i==rows-1 || grid[i+1][j]==0)peri++
                    if(j==0 || grid[i][j-1]==0) peri++
                    if(j==cols-1 || grid[i][j+1]==0) peri++
                }
            }
        }
        return peri
        
    }
}