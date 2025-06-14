class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map1 = mutableMapOf<Int,Int>()
        val res = IntArray(k)

        nums.forEach{item ->
            val counter = map1.getOrDefault(item,0)+1
            map1[item] = counter
        }

        val minHeap = PriorityQueue<Int>(compareBy{map1[it]})
        for(key in map1.keys){
            minHeap.offer(key)
            if (minHeap.size>k) minHeap.poll()
        }

        for(i in 0 until k){
            res[i]=minHeap.poll()
        }

        return res




        
    }
}