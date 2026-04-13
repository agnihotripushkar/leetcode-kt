class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { mutableSetOf<Char>() }
        val cols = Array(9) { mutableSetOf<Char>() }
        val boxes = Array(9) { mutableSetOf<Char>() }

        for(r in 0 until 9){
            for(c in 0 until 9){
                val char = board[r][c]
                if(char =='.') continue

                val boxIndex = (r / 3) * 3 + (c / 3)

                if (rows[r].contains(char) || 
                    cols[c].contains(char) || 
                    boxes[boxIndex].contains(char)) {
                    return false
                }

                rows[r].add(char)
                cols[c].add(char)
                boxes[boxIndex].add(char)

            }
        }

        return true
        
    }
}