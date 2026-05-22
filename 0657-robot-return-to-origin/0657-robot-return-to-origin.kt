class Solution {
    fun judgeCircle(moves: String): Boolean {
        var uCount = 0
        var lCount = 0

        for(ch in moves){
            if(ch=='U'){
                uCount++
            }
            if(ch=='D'){
                uCount--
            }
            if(ch=='R'){
                lCount--
            }
            if(ch=='L'){
                lCount++
            }
        }

        if(lCount == 0 && uCount==0) return true
        else return false

        
    }
}