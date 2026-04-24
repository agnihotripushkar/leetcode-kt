class Solution {
    fun furthestDistanceFromOrigin(moves: String): Int {
        var count = 0
        var ans = 0
        for(i in 0 until moves.length){
            if(moves[i]=='L'){
                count--
            }
            else if(moves[i]=='R'){
                count++
            }
            else if(moves[i]=='_'){
                ans++
            }
        }

        if(count>=0){
            return count+ans
        }
        else{
            return Math.abs(count - ans)
        }
    
    }
}