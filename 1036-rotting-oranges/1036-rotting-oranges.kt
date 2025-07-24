class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val queue:Queue<Pair<Int,Int>> = LinkedList()
        val directions = arrayOf(Pair(0,1),Pair(1,0),Pair(0,-1),Pair(-1,0))

        var timer = -1
        var fresh = 0

        for(i in 0 until rows){
            for(j in 0 until cols){
                if(grid[i][j]==2){
                    queue.offer(Pair(i,j))
                }
                if(grid[i][j]==1){
                    fresh++
                }
            }
        }

        if (fresh == 0) {
            return 0
        }

        while(queue.isNotEmpty()){
            val size = queue.size
            for(k in 0 until size){
                val (x,y) = queue.poll()
                for((dx,dy) in directions){
                val newRow = x+dx
                val newCol = y +dy
                if(newRow in 0 until rows && newCol in 0 until cols && grid[newRow][newCol]==1){ 
                    grid[newRow][newCol]=2
                    fresh--
                    queue.offer(Pair(newRow,newCol))
                    }
                }
            }  
            timer++
        }

        if(fresh==0){
            return timer
        }
        else return -1
    }
}