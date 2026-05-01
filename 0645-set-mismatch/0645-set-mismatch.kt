class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        var missing = -1
        var twice = -1
        var n = nums.size
        var counter = IntArray(n+1)

        for(num in nums){
            counter[num]++
        }

        for(i in 1..n){
            if(counter[i]==0){
                missing = i
            }
            else if(counter[i]==2){
                twice = i
            }
        }
        return intArrayOf(twice, missing)
    }
}