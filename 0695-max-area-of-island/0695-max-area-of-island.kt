class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var maxArea = 0
        val visited = Array(rows){IntArray(cols)}

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(grid[i][j]==1){
                    val area = dfs(i,j,grid,visited)
                    maxArea = maxOf(maxArea,area)
                }
            }
        }
        return maxArea  
    }

    fun dfs(row:Int,col:Int,grid:Array<IntArray>,visited:Array<IntArray>):Int{
        var currentArea = 1
        visited[row][col] = 1
        val directions = arrayOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))

        for((dx,dy) in directions){
            val newRow = dx+row
            val newCol = dy+col
            if(isValid(newRow,newCol,visited,grid)){
                currentArea += dfs(newRow,newCol,grid,visited)
            }
        }

        return currentArea

    }

    fun isValid(newRow:Int,newCol:Int,visited:Array<IntArray>,grid:Array<IntArray>):Boolean{
        val rows = grid.size
        val cols = grid[0].size

        return newRow in 0 until rows  &&
                newCol in 0 until cols &&
                visited[newRow][newCol]==0 &&
                grid[newRow][newCol]==1
    }
}