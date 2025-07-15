class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size-1

        while(left < right){
            val addition = numbers[left] + numbers[right]
            if (addition==target){
                return intArrayOf(left+1,right+1)
            }
            if (addition>target){
                right--
            }
            else{
                left++
            }
        }
        return intArrayOf()
        
    }
}