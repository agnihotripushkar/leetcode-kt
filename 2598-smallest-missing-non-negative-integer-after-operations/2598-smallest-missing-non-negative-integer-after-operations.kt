class Solution {
    fun findSmallestInteger(nums: IntArray, value: Int): Int {
        var ans = 0
        val freqMod = IntArray(value)

        for (i in 0 until nums.size) {
            val remainder = (nums[i] % value + value) % value
            freqMod[remainder]++
        }

        for(i in 0.. nums.size){
            val requiredRemainder = ans % value
            if (freqMod[requiredRemainder] > 0) {
                freqMod[requiredRemainder]--
                ans++
            } else {
                return ans
            }
        }

        return ans
    }
}