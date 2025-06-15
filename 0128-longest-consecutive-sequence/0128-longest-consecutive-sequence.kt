class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set1 = mutableSetOf<Int>()
        var maxStreak = 0

        for (i in nums){
            set1.add(i)
        }

        for (j in set1){
            if (!set1.contains(j-1)){
                var currentNum = j
                var currentStreak = 1

                while(set1.contains(currentNum+1)){
                    currentStreak++
                    currentNum++
                }
                maxStreak = Math.max(maxStreak, currentStreak)
            }
        }
        return maxStreak
    }
}