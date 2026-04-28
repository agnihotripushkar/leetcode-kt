class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val res = IntArray(nums.size)
        for(i in 0 until n){
            res[2 * i] =  nums[i]
            res[2 * i + 1] = nums[n+i]
        }
        return res
    }
}