class Solution {
    fun countSubIslands(grid1: Array<IntArray>, grid2: Array<IntArray>): Int {
        val rows = grid1.size
        val cols = grid1[0].size
        val visited = Array(rows){IntArray(cols)}
        var subCount = 0

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(grid2[i][j]==1 && visited[i][j]==0){
                    if(dfs(i,j,grid1,grid2,visited)){
                        subCount++
                    }
                }
            }
        }
        return subCount
    }

    fun isValid(newRow: Int, newCol: Int, grid: Array<IntArray>, visited: Array<IntArray>): Boolean {
        val rows = grid.size
        val cols = grid[0].size
        return newRow in 0 until rows && newCol in 0 until cols && 
               grid[newRow][newCol] == 1 && visited[newRow][newCol] == 0
    }

    fun dfs(row:Int, col:Int, grid1:Array<IntArray>, grid2:Array<IntArray>, 
    visited:Array<IntArray>):Boolean{
        visited[row][col]=1
        var isSubIsland =  true

        if(grid1[row][col]!=1){
            isSubIsland = false
        }

        val directions = listOf(Pair(1, 0), Pair(0, 1), Pair(-1, 0), Pair(0, -1))
        for((dx,dy) in directions){
            val newRow = dx+ row
            val newCol = dy + col
            if(isValid(newRow, newCol, grid2,visited)){
                val res =  dfs(newRow,newCol,grid1,grid2,visited)
                isSubIsland =  isSubIsland and res 
            }
        }
        return isSubIsland
    }
}