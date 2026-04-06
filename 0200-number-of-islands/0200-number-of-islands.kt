class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var count = 0
        val visited = Array(rows){IntArray(cols)}

        // for(i in 0 until rows){
        //     for(j in 0 until cols){
        //         visited[i][j]=0
        //     }
        // }

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    count++
                    dfs(i,j,grid,visited)
                }
            }
        }
        return count
    }

    fun dfs(i:Int,j:Int,grid:Array<CharArray>,visited:Array<IntArray>){
        visited[i][j]=1
        val directions = arrayOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))

        for(dir in directions){
            val newRow = i+dir.first
            val newCol = j +dir.second
            if(isValid(newRow,newCol,visited,grid)){
                dfs(newRow,newCol,grid,visited)
            }
        }
    }

    fun isValid(newRow:Int,newCol:Int,visited:Array<IntArray>,grid:Array<CharArray>):Boolean{
        val rows = grid.size
        val cols = grid[0].size

        return newRow in 0 until rows  &&
                newCol in 0 until cols &&
                visited[newRow][newCol]==0 &&
                grid[newRow][newCol]=='1'
    }
}