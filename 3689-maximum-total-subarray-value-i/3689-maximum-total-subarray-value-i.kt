class Solution {
    fun maxTotalValue(nums: IntArray, k: Int): Long {
        val maxNo = nums.maxOrNull()
        val minNo = nums.minOrNull()
        val diff = (maxNo!! - minNo!!).toLong()
        return k * diff
    }
}