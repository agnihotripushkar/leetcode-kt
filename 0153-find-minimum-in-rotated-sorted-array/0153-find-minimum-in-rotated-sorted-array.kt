class Solution {
    fun findMin(nums: IntArray): Int {
        var start = 0
        var end = nums.size -1 
        var min = Int.MAX_VALUE

        while(start <=end){
            val mid = (start+end)/2

            if(nums[mid]>= nums[start]){
                min = min(min,nums[start])
                start = mid + 1
            }
            else{
                min = min(min,nums[mid])
                end = mid -1
            }
        }
        
        return min
    }
}