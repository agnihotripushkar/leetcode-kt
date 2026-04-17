class Solution {
    fun isPossibleToCutPath(grid: Array<IntArray>): Boolean {
        if(!dfs(0,0,grid)) return true
        grid[0][0] = 1
        if(!dfs(0,0,grid)) return true
        return false
    }

    fun dfs(i:Int,j:Int,grid:Array<IntArray>):Boolean{
        val rows = grid.size
        val cols = grid[0].size

        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j]==0) return false
        
        if(i==rows-1 && j ==cols-1){
            return true
        }

        grid[i][j] = 0
        return dfs(i+1,j,grid) || dfs(i,j+1,grid)
   
    }
}