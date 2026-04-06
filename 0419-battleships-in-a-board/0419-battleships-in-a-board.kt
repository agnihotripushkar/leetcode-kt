class Solution {
    fun countBattleships(board: Array<CharArray>): Int {
        val rows = board.size
        val cols = board[0].size
        var count = 0

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(board[i][j]=='.') continue
                if(i>0 && board[i-1][j]=='X') continue
                if(j>0 && board[i][j-1]=='X') continue
                count++
            }
        }

        return count
        
    }
}