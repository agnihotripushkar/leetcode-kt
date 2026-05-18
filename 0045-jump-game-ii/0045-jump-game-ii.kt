class Solution {
    fun jump(nums: IntArray): Int {
        var minJumpCount = 0
        var currEnd = 0
        var maxEnd = 0

        for(i in 0 until nums.size - 1){
            maxEnd = maxOf(maxEnd, i+nums[i])
            if(i==currEnd){
                minJumpCount++
                currEnd = maxEnd
            }
        }

        return minJumpCount
        
    }
}