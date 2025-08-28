class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        val map = mutableMapOf<Int,Int>()

        nums.forEach{
            map[it] = map.getOrDefault(it,0)+1
        } 

        val maxFrequency = map.values.maxOrNull() ?: return 0 

        return map.values.filter{it==maxFrequency}.sum()
    }
}