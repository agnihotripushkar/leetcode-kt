class Solution {
    fun constructTransformedArray(nums: IntArray): IntArray {
        val size = nums.size
        val ans = IntArray(size)

        for(i in 0 until size){
            val index = ((i + nums[i]) % size + size) % size
            ans[i] = nums[index]
        }

        return ans
        
    }
}