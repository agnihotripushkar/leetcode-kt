class Solution {
    fun missingInteger(nums: IntArray): Int {
        val list = mutableListOf<Int>()
        val set = mutableSetOf<Int>()
        list.add(nums[0])

        for(i in 1 until nums.size){
            if(nums[i] != nums[i-1]+1){
                break
            }
            list.add(nums[i])
        }

        for(i in nums.indices){
            set.add(nums[i])
        }

        var sum = list.sum()

        while(set.contains(sum)){
            sum++
        }

        return sum

        
    }
}