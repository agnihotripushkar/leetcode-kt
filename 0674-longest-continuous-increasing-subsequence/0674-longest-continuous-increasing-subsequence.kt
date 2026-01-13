class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        val arraySize = nums.size
        if (arraySize ==0){
            return 0
        }
        var left = 0
        var right = 1
        var max = 1

        while (right < arraySize){
            if(nums[right]> nums[right-1]){ 
                max = maxOf(max, (right-left+1))
            }
            else{
                left = right
                max = maxOf(max,(right-left+1))
            }
            right++
        }
        return max
        
    }
}