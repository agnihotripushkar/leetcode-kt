class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val res = ArrayList<String>()
        val size = nums.size

        if(nums.isEmpty()){
            return res
        }

        var left = 0

        while(left < size){
            var start = nums[left]
            var right = left + 1

            while(right<size && nums[right] == nums[right-1]+1 ){
                right++
            }

            var end = nums[right-1]
            if(start==end){
                res.add(start.toString())
            }
            else{
                res.add("$start->$end")
            }
            left=right
        }

        return res
        
    }
}