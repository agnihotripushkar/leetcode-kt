class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        val n  = nums.size
        var minLen = n+1
        var l = 0
        var sum = 0

        for (i in 0 until n){
            sum += nums[i]

            if(sum >= target){
                while(sum>=target){
                    var count = i-l+1
                    if(count < minLen){
                        minLen = count
                    }
                    sum -=nums[l]
                    l++ 
                }
            }
        }

       if(minLen > n){
        return 0
       } else{
        return minLen
       }
        
    }
}