class Solution {
    fun minDistance(word1: String, word2: String): Int {
        val m = word1.length
        val n = word2.length

        val cost = Array(m+1){IntArray(n+1)}

        for(i in 0 .. m){
            cost[i][0] = i
        }

        for (j in 0..n){
            cost[0][j] = j
        }

        for(i in 1 .. m){
            for(j in 1 .. n){
                if(word1[i-1]==word2[j-1]){
                    cost[i][j] = cost[i-1][j-1]
                }
                else{
                    val top = cost[i-1][j]
                    val left = cost[i][j-1]
                    val dig = cost[i-1][j-1]
                    cost[i][j] = 1 + minOf(top,left,dig)
                }
            }
        }

        return cost[m][n]
    }
}