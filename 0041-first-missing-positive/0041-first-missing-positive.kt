class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        val set = nums.toSet()
        var i = 1
        while(set.contains(i))i++
        return i
    }
}