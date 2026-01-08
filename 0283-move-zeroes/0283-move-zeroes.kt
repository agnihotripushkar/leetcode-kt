class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        val length = nums.size
        if(length < 2){
            return
        }

        for(i in 0 until length){
            var poi1 = 0
            var poi2 = poi1 + 1

            while(poi1<poi2 && poi2<length){
                if(nums[poi1]==0 && nums[poi2]!=0){
                    var temp = nums[poi2]
                    nums[poi2] = nums[poi1]
                    nums[poi1] = temp
                }
                poi1++
                poi2++
            }
        }
    }
}