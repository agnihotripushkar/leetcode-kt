class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var ans = 0

        for(i in 0 until nums.size){
            if(nums[i]==1){
                count++
                ans = maxOf(count,ans)
            }
            if(nums[i]==0){
                ans = maxOf(count,ans)
                count = 0
            }
        }

        return ans
        
    }
}