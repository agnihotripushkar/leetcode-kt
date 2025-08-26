import java.util.Collections

class Solution {
    fun thirdMax(nums: IntArray): Int {
        var counter = 0
        val maxHeap = PriorityQueue<Int>(Collections.reverseOrder())
        var ans = nums[0]
        var max = nums[0]
        for (num in nums){
            if(!maxHeap.contains(num)){
                maxHeap.add(num)
            } 
        }

        for (i in 0 until maxHeap.size){
            ans = maxHeap.poll()
            counter++
            if(counter==1){
                max = ans
            }
            if(counter==3){
                return ans
            }
        }

        return max
        
    }
}