class Solution {
    fun solve(board: Array<CharArray>): Unit {
        // just map the 0 that are connected on boarder only
        val rows = board.size
        val cols = board[0].size
        val visited = Array(rows){IntArray(cols)}

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(i==0 || i==rows-1 || j==0 || j==cols-1){
                     if(board[i][j]=='O' && visited[i][j]==0){
                        dfs(i,j,board,visited)
                    }
                }
            }
        }

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(board[i][j]=='O'){
                    board[i][j]='X'
                }
                if(board[i][j]=='S'){
                    board[i][j]='O'
                }
            }
        }
    }

    fun dfs(i:Int,j:Int,board:Array<CharArray>,visited:Array<IntArray>){
        visited[i][j]=1
        board[i][j]='S'
        val directions = arrayOf(Pair(0,1),Pair(1,0),Pair(0,-1),Pair(-1,0))
        for((dx,dy) in directions){
            val newRow = i+dx
            val newCol = j + dy
            if(isValid(newRow,newCol,board,visited)){
                dfs(newRow,newCol,board,visited)
            }
        }
    }

    fun isValid(i:Int,j:Int,board:Array<CharArray>,visited:Array<IntArray>):Boolean{
        val rows = board.size
        val cols = board[0].size
        return i in 0 until rows && j in 0 until cols && board[i][j]=='O' && visited[i][j]==0
    }
}