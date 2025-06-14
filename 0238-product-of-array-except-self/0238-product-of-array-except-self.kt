class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val size = nums.size
        val leftProduct = IntArray(size)
        val rigthProduct = IntArray(size)
        val ansProduct = IntArray(size)

        leftProduct[0] = 1
        for (i in 1 until size){
            leftProduct[i] = leftProduct[i-1] * nums[i-1]
        }

        rigthProduct[size-1] = 1
        for (i in size-2 downTo 0){
            rigthProduct[i] = rigthProduct[i+1] * nums[i+1]
        }

        for (i in 0 until size){
            ansProduct[i] = leftProduct[i] * rigthProduct[i]
        }

        return ansProduct
    }
}