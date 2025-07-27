class Solution {
    fun findDuplicate(nums: IntArray): Int {
        nums.sort()
        var p1 = 0
        val n = nums.size

        for(i in 1 until n){
            if(nums[p1]==nums[i]){
                return nums[i]
            }
            p1++
        }
        return nums[n]
    }
}