class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var left = 0
        var count = 0
        var maxlength = 0

        for(right in nums.indices){
            if(nums[right]==0){
                count++
            }
            while(count>k){
                if(nums[left]==0){
                    count--
                }
                left++
            }

            maxlength = maxOf(maxlength, right-left+1)
        }

        return maxlength
        
    }
}