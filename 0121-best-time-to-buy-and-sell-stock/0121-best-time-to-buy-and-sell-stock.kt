class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minPrice = prices[0]

        for (price in prices){
            minPrice = Math.min(minPrice, price)
            maxProfit = Math.max(maxProfit,(price-minPrice))
        }

        return maxProfit
        
    }
}