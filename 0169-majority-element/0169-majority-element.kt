class Solution {
    fun majorityElement(nums: IntArray): Int {
        var counter = 0
        val len = nums.size
        var item = 0

        if(len<2){
            return nums[0]
        }

        for(num in nums){
            if(counter ==0){
                item = num
            }

            if(num==item){
                counter++
            }
            else{
                counter--
            }   
        }

        return item

    
        
    }
}