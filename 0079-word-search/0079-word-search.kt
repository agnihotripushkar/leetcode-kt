class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val rows = board.size
        val cols = board[0].size

        fun DFS(i:Int,j:Int,pointer:Int,visited:Array<BooleanArray>):Boolean{
            if(pointer == word.length){
                return true
            }

            if(i<0 || i>= rows || j<0 || j>=cols || visited[i][j] || 
                        board[i][j]!=word[pointer]){
                return false
            }

            visited[i][j] = true

            val directions = arrayOf(
                intArrayOf(0,1),
                intArrayOf(0,-1),
                intArrayOf(1,0),
                intArrayOf(-1,0)
            )

            for((dx,dy) in directions){
                val newRow = dx+i
                val newCol = dy+j

                if(DFS(newRow,newCol,pointer+1,visited)){
                    return true
                }
            }

            visited[i][j] = false
            return false
        }

        for(i in 0 until rows){
            for (j in 0 until cols){
                if(board[i][j]==word[0]){
                    val visited = Array(rows){BooleanArray(cols){false}}
                    if(DFS(i,j,0,visited)){
                        return true
                    }
                }

            }
        }
        return false
        
    }
}