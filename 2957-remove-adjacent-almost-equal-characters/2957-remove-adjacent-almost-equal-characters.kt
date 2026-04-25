class Solution {
    fun removeAlmostEqualCharacters(word: String): Int {
        var skip = false
        var count = 0
        for(i in 1 until word.length){
            if(skip){
                skip = false
                continue
            }
            if(Math.abs(word[i]-word[i-1])<=1){
                count++
                skip = true
            }
        }

        return count
        
    }
}