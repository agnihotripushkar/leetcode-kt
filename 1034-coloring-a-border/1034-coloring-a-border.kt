class Solution {
    fun colorBorder(grid: Array<IntArray>, row: Int, col: Int, color: Int): Array<IntArray> {
        val rows = grid.size
        val cols = grid[0].size
        val found = grid[row][col]
        val visited = Array(rows){IntArray(cols)}
        val border = mutableListOf<Pair<Int,Int>>()

        dfs(grid,row,col,color,visited,found,border)
        for((r,c)in border){
            grid[r][c] = color
        }

        return grid
        
    }

    fun dfs(grid: Array<IntArray>, row: Int, col: Int, color: Int,
    visited:Array<IntArray>,found:Int, border:MutableList<Pair<Int,Int>>){
        val rows = grid.size
        val cols = grid[0].size
        visited[row][col]=1

        if(row==0 || row == rows-1 || col==0 || col==cols-1 || checkForBorder(row,col,grid,found)){
            border.add(Pair(row,col))
        }

        val directions = arrayOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))
        for((dx,dy) in directions){
            val newRow = dx+row
            val newCol = dy + col
            if(isValid(newRow,newCol,grid,visited,found)){
                dfs(grid,newRow,newCol,color,visited,found,border)
            }
        }
    }

    fun isValid(row: Int, col: Int, grid: Array<IntArray>, visited:Array<IntArray>,found:Int):Boolean{
        val rows = grid.size
        val cols = grid[0].size
        return row in 0 until rows && col in 0 until cols && grid[row][col]==found && visited[row][col]==0
    }

    fun checkForBorder(row: Int, col: Int, grid: Array<IntArray>,found:Int):Boolean{
        val directions = arrayOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))

        for((dx,dy) in directions){
            val neix = dx+row
            val neiy = dy+col
            if(grid[neix][neiy]!=found){
                return true
            }
        }
        return false
    }
}