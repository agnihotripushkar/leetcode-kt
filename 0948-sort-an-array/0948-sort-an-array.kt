class Solution {
    fun sortArray(nums: IntArray): IntArray {
        val heap = PriorityQueue<Int>()
        val sortedList = mutableListOf<Int>()

        nums.forEach{
            heap.add(it)
        }

        while(heap.isNotEmpty()){
            sortedList.add(heap.poll())
        }

        return sortedList.toIntArray()
        
    }
}