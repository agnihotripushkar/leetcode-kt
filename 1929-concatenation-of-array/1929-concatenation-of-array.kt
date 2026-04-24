class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val size = nums.size
        val res = IntArray(2*size)

        for(i in 0 until size){
            res[i] = nums[i]
            res[size+i] = nums[i]
        }

        return res
    }
}