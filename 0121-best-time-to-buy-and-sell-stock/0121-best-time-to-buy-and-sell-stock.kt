class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minPrice = prices[0]

        for (i in 1 until prices.size){
            minPrice = Math.min(minPrice,prices[i])
            maxProfit = Math.max(maxProfit, prices[i]-minPrice)
        }
        
        return maxProfit
    }
}