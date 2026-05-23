class Solution {
    fun recurssion(nums:IntArray, currentSum:Int, currentIndex:Int, target:Int):Int{
        if(currentIndex==nums.size){
            if(currentSum==target) return 1
            else return 0
        }
        
        val add = recurssion(nums,currentSum + nums[currentIndex],currentIndex+1,target)
        val sub = recurssion(nums,currentSum - nums[currentIndex],currentIndex+1,target)

        return add + sub
    }

    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        return recurssion(nums,0,0,target)
    }
}