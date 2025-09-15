class Solution {
    fun reverse(x: Int): Int {
        var isNegative = x<0
        var input = abs(x.toLong())
        var ans = 0L

        while(input > 0){
            ans = ans * 10 + (input % 10)
            input /= 10
        }
        if(ans>Int.MAX_VALUE){
            return 0
        }
        if(isNegative){
            return 0 - ans.toInt()
        }

        return ans.toInt()
        
    }
}