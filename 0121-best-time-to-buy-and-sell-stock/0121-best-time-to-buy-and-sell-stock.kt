class Solution {
    fun maxProfit(prices: IntArray): Int {
        if(prices.isEmpty()){
            return 0
        }
        var minVal = prices[0]
        var maxProfit = 0

        for(i in 1 until prices.size){
            minVal = Math.min(minVal, prices[i])
            maxProfit = Math.max(maxProfit, prices[i]-minVal)
        }
        return maxProfit
    }
}