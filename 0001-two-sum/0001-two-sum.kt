class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index, i ->
        val find = target - i
        if (nums.contains(find)) {
            val int1 = nums.indexOf(find)
            if (index != int1) {
                return intArrayOf(index, int1)
            }
        }
    }
    return intArrayOf(0, 0)
    }
}