class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var maxArea = 0
        val visited = Array(rows){IntArray(cols)}

        for(i in 0 until rows){
            for(j in 0 until cols){
                visited[i][j]=0
            }
        }

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(grid[i][j]==1 && visited[i][j]==0){
                    val area = DFS(grid, i, j, visited)
                    maxArea = maxOf(maxArea, area)
                }
            }
        }

        return maxArea
    }

    fun DFS(grid: Array<IntArray>,i:Int,j:Int,visited:Array<IntArray>):Int{
        visited[i][j]=1
        var area = 1
        val directions = arrayOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))

        for((dx,dy) in directions){
            val newRow = i+dx
            val newCol = j+dy

            if(isValid(grid,newRow,newCol,visited)){
                area += DFS(grid,newRow,newCol,visited)
            }
        }
        return area
    }

    fun isValid(grid: Array<IntArray>,i:Int,j:Int,visited:Array<IntArray>):Boolean{
        val rows = grid.size
        val cols = grid[0].size

        return i in 0 until rows && j in 0 until cols && grid[i][j]==1 && visited[i][j]==0

    }
}