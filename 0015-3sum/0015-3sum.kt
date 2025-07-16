class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val n = nums.size
        val result = mutableSetOf<List<Int>>()

        for (i in 0 until n-2){
            var left = i+1
            var right = n-1
            while(left < right){
            val total = nums[i] + nums[left] + nums[right]
            if (total==0){
                result.add(listOf(nums[i],nums[left],nums[right]))
                left++
                right--
            }
            if (total<0){
                left++
            } 
            if (total>0){
                right--
            }
        }
        }    
        return result.toList()
    }
}