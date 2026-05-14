class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        var i = 1
        val set1 = nums.toSet()
        while(set1.contains(i))i++
        return i
    }
}