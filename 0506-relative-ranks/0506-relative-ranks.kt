class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val maxHeap = PriorityQueue<Int>(compareByDescending { it })
        val res = Array<String>(score.size){""}
        val prizePlaces = arrayOf("Gold Medal", "Silver Medal", "Bronze Medal")

        for(item in score){
            maxHeap.add(item)
        }

        var count = 1

        while(maxHeap.isNotEmpty()){
            val value = maxHeap.poll()
            val index = score.indexOf(value)
            when(count){
                1 -> res[index] = prizePlaces[0]
                2 -> res[index] = prizePlaces[1]
                3 -> res[index] = prizePlaces[2]
                else -> res[index] = count.toString()
            }
            count++
        }  

        return res
    }
}