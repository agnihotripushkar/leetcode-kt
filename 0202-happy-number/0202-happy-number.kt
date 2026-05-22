class Solution {

    fun getDigitSums(n:Int):Int{
        var totalSum = 0
        var nums = n
        while(nums!=0){
            val digit  = nums%10
            totalSum = totalSum + digit * digit
            nums = nums/10
        }
        return totalSum
    }

    fun isHappy(n: Int): Boolean {
        var slow = n
        var fast =  getDigitSums(n)

        while(slow!=fast && fast!=1){
            slow = getDigitSums(slow)
            fast = getDigitSums(getDigitSums(fast))
        }

        return fast ==1

    }
}