class Solution {
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        val n = cardPoints.size
        var sum = 0

        for(i in 0 until k){
            sum += cardPoints[i]
        }

        var maxSum = sum
        for(i in 0 until k){
            sum -=cardPoints[k-1-i]
            sum += cardPoints[n-1-i]
            maxSum = maxOf(maxSum, sum)
        }

        return maxSum
    }
}