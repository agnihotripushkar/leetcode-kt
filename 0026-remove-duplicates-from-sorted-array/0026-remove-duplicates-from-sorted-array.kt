class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var high = 0

        for(i in 1 until nums.size){
            if(nums[i]!=nums[high]){
                high++
                nums[high] = nums[i]
            }
        }
        return high + 1
    }
}