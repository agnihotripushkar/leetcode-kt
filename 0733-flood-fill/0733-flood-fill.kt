class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val startColor = image[sr][sc]
        if(startColor == color) return image

        dfs(image,startColor,color,sr,sc)
        return image
        
    }

    fun dfs(image:Array<IntArray>,startColor:Int,color:Int,r:Int,c:Int){
        image[r][c] = color
        val directions = arrayOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))
        for((dx,dy) in directions){
            val newRow = r+dx
            val newCol = c+dy
            if(isValid(newRow,newCol,image,startColor)){
                dfs(image,startColor,color,newRow,newCol)
            }
        }
    }

    fun isValid(newRow:Int,newCol:Int,image:Array<IntArray>,startColor:Int):Boolean{
        val rows = image.size
        val cols = image[0].size

        return newRow in 0 until rows && 
            newCol in 0 until cols &&
            image[newRow][newCol]==startColor
    }
}