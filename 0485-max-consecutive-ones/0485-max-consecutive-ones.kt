class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var counter = 0
        var maxCounter = 0
        val n = nums.size

        for(i in 0 until n){
            if(nums[i]==1){
                counter++
            }
            else{ 
                maxCounter = maxOf(maxCounter,counter)
                counter = 0
            }
        }
        return maxOf(maxCounter,counter)
    }
}