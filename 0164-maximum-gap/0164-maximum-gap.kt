class Solution {
    fun maximumGap(nums: IntArray): Int {
        val pq = PriorityQueue<Int>()
        var diff = 0

        for(num in nums){
            pq.add(num)
        }

        var prev = pq.poll()
        while(pq.isNotEmpty()){
            val curr = pq.poll()
            diff = maxOf(diff, curr-prev)
            prev = curr
        }

        return diff
  
    }
}