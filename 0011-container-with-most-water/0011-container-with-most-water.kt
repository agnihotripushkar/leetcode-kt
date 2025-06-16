class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size-1
        var maxArea = 0

        while(left<right){
            val w = right - left
            val h = Math.min(height[left],height[right])
            val area = w*h
            maxArea = Math.max(area, maxArea)
            if (height[left]<height[right]){
                left++
            }
            else{
                right--
            }
        }

        return maxArea
        
    }
}