class Solution {
    fun canJump(nums: IntArray): Boolean {
        var maxReach = 0

        for(i in 0 until nums.size){
            if(maxReach>=i){
                maxReach = maxOf(maxReach, i+nums[i])
            }
        }

        return maxReach>=nums.size-1
    }
}