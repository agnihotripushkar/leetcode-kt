class Solution {
    fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        val rows = mat.size
        val cols = mat[0].size
        val result = Array(rows){IntArray(cols)}
        val queue:Queue<Pair<Int,Int>> = LinkedList()

        // Initialize result array and queue
        for(i in 0 until rows){
            for (j in 0 until cols){
                if(mat[i][j]==0){
                    result[i][j]=0
                    queue.offer(Pair(i,j))
                } else {
                    result[i][j] = Int.MAX_VALUE // Initialize non-zero cells to MAX_VALUE
                }
            }
        }

        // Define directions for BFS traversal
        val directions = arrayOf(Pair(0,1), Pair(0,-1), Pair(1,0), Pair(-1,0))

        while(!queue.isEmpty()){
            val (x,y) = queue.poll() // Dequeue current cell
            
            // Explore neighbors
            for((dx, dy) in directions){ // Correct destructuring for Pair
                val newRow = x + dx
                val newCol = y + dy

                // Check bounds and if a shorter path is found
                if(newRow in 0 until rows && newCol in 0 until cols && result[newRow][newCol] > result[x][y] + 1){
                    result[newRow][newCol] = result[x][y] + 1 // Update distance
                    queue.offer(Pair(newRow,newCol)) // Enqueue neighbor
                } 
            }
        }

        return result
    }
}