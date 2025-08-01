class Solution {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var left = weights.maxOrNull()!!
        var right = weights.sum()
        var ans = right

        while(left<=right){
            val capacity = left + (right-left)/2
            var sum = 0
            var day = 1
            for(weight in weights){
                if(sum+weight >capacity){
                    day++
                    sum = weight
                }
                else{
                    sum +=weight
                }
            }
            if(day<=days){
                ans = capacity
                right = capacity -1 
            }
            else if (day>days){
                left = capacity + 1
            }    
        }
        return ans
    }
}