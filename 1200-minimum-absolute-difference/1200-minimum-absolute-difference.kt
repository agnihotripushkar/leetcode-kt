class Solution {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        arr.sort()
        var min = Int.MAX_VALUE
        val size = arr.size
        val result = mutableListOf<List<Int>>()

        for(item in 0 until size-1){
            val diff = arr[item+1] - arr[item]
            if(diff < min){
                result.clear()
                min = diff
                result.add(listOf(arr[item], arr[item+1]))
            }
            else if(diff == min){
                result.add(listOf(arr[item], arr[item+1]))
            }
        } 

        return result
        
    }
}