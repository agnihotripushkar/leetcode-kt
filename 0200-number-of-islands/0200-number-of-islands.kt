class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val visited = Array(rows){IntArray(cols)}
        var count =0

        for(i in 0 until rows){
            for(j in 0 until cols){
                visited[i][j] = 0
            }
        }

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    DFS(grid,i,j,visited)
                    count++
                }
            }
        }
        return count
    }

        fun DFS(grid:Array<CharArray>,i:Int, j:Int,visited:Array<IntArray>){
            visited[i][j]=1
            val directions = arrayOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))

            for((dx,dy) in directions){
                val newRow = i+dx
                val newCol = j+dy

                if(isValid(newRow,newCol,visited,grid)){
                    DFS(grid,newRow,newCol,visited)
                }
            }
        }

        fun isValid(newRow:Int,newCol:Int,visited:Array<IntArray>,grid:Array<CharArray>):Boolean{
            val rows = grid.size
            val cols = grid[0].size

            return newRow in 0 until rows && newCol in 0 until cols && visited[newRow][newCol]==0
            && grid[newRow][newCol]=='1'
        
    }
}