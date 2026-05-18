class Solution {
    fun canJump(nums: IntArray): Boolean {
        var maxReach = 0

        for(i in 0 until nums.size){
            if(i>maxReach){
                return false
            }
            val canMaxGo = i+ nums[i]
            maxReach = maxOf(maxReach,canMaxGo)
            if(maxReach >= (nums.size-1)){
                return true
            }
        }

        return false
        
    }
}