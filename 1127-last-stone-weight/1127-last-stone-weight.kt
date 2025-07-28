import java.util.Collections
class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val minHeap = PriorityQueue<Int>(Collections.reverseOrder())

        for(item in stones){
            minHeap.add(item)
        }

        while(minHeap.size >= 2){
            val one = minHeap.poll()
            val two = minHeap.poll()

            val sub = abs(one-two)
            if(sub!=0){
                minHeap.add(sub)
            }
        }

        if(minHeap.isEmpty()){
            return 0
        }
        else return minHeap.poll()
        
    }
}