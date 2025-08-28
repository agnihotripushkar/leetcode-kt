class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int,Int>()
        map.put(0,1)
        var currentSum = 0
        var result = 0

        nums.forEach{
            currentSum += it 
            val requiredSum = currentSum -k
            if(map.containsKey(requiredSum)){
                result += map[requiredSum]!! 
            }
            map[currentSum] = map.getOrDefault(currentSum,0)+1
        }

        return result
        
    }
}