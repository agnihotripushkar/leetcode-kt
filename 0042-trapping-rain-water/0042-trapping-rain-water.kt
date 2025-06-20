class Solution {
    fun trap(height: IntArray): Int {
        val n = height.size
        if (n==0) return 0

        val leftMaxArray = IntArray(n) {0}
        val rigthMaxArray = IntArray(n){0}

        leftMaxArray[0] = height[0]
        for (i in 1 until n){
            leftMaxArray[i] = Math.max(leftMaxArray[i-1],height[i])
        }

        rigthMaxArray[n-1] = height[n-1]
        for (j in n-2 downTo 0){
            rigthMaxArray[j] = Math.max(rigthMaxArray[j+1],height[j])

        }

        var water = 0
        for(i in 0 until n){
            water += Math.min(leftMaxArray[i],rigthMaxArray[i]) - height[i]
        }

        return water
    }
}