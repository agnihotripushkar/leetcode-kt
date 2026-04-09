class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        val rows = mat.size
        var sum = 0
        val list = mutableSetOf<Pair<Int,Int>>()

        for(i in 0 until rows){
            for(j in 0 until rows){
                 if(i==j && !list.contains(Pair(i,j))){
                    list.add(Pair(i,j))
                    println(mat[i][j])
                    sum += mat[i][j]
                 }
            }
        }
        println("sum = ${sum}")

        for(i in rows-1 downTo 0){
            for(j in 0 until rows){
                if(i+j==(rows-1) && !list.contains(Pair(i,j))){
                    list.add(Pair(i,j))
                    println("${mat[i][j]} with $i and $j")
                    sum += mat[i][j]
                }
            }
        }

        return sum
        
    }
}