class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val n = numbers.size
        var left = 0
        var right = n-1

        while (left<right){
            val sum = numbers[left] + numbers[right]
            if (sum<target){
                left= left+1
            }
            if (sum>target){
                right = right-1
            }
            if (sum == target){
                return intArrayOf(left+1,right+1)
            }
        }
        return intArrayOf(0,1)
    }
}