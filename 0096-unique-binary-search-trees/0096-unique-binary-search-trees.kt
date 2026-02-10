class Solution {
    fun numTrees(n: Int): Int {
        val dp = IntArray(n+1)
        dp[0] = 1
        dp[1] = 1
        for(i in 2..n){
            for(j in 1..i){
                val left = j - 1
                val right = i-j
                dp[i]+= dp[left] * dp[right]
            }
        }
        return dp[n]
    }
}