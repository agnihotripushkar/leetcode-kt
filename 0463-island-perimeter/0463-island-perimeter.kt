class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val visited = Array(rows){IntArray(cols)}
        var ans = 0


        for(i in 0 until rows){
            for(j in 0 until cols){
                visited[i][j]=0
            }
        }

        for(i in 0 until rows){
            for(j in 0 until cols){       
                if(grid[i][j]==1 && visited[i][j]==0){
                    ans = DFS(grid, i, j, visited)
                    return ans
                }
            }
        }

        return ans
    }

    fun DFS(grid: Array<IntArray>, i: Int, j: Int, visited: Array<IntArray>):Int{
        visited[i][j]=1
        val directions = arrayOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))
        var peri = 0

        for((dx,dy) in directions){
            val newRow = i+dx
            val newCol = j+dy

            if(isValid(newRow,newCol,grid)){
                peri++
            }
            else if (visited[newRow][newCol] == 0 && grid[newRow][newCol] == 1) {
                peri += DFS(grid, newRow, newCol, visited)
            }
        }

        return peri
        
    }

    fun isValid(newRow:Int,newCol:Int,grid:Array<IntArray>):Boolean{
        val rows = grid.size
        val cols = grid[0].size
        return newRow !in 0 until rows || newCol !in 0 until cols || grid[newRow][newCol]==0 

    }
}