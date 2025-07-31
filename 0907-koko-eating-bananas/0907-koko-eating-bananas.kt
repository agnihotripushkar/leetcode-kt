class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.maxOrNull()!!

        var ans = right

        while (left <= right) {
            val midSpeed = left + (right - left) / 2
            
            fun canFinish(speed: Int): Boolean {
                var timeNeeded = 0L
                for (pile in piles) {
                    timeNeeded += (pile + speed - 1) / speed
                }
                return timeNeeded <= h
            }

            if (canFinish(midSpeed)) {
                ans = midSpeed
                right = midSpeed - 1
            } else {
                left = midSpeed + 1
            }
        }
        return ans
    }
}