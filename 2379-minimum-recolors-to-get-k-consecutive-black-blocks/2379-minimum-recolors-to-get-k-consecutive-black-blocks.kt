class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var left = 0
        var right = k-1
        val size = blocks.length
        var currCount = 0
        var min = 0

        for(i in 0 until k){
            if(blocks[i]=='W')currCount++
        }

        min = currCount

        while(right<size-1){
            right++
            if(blocks[right]=='W')currCount++
            if(blocks[left]=='W')currCount--
            left++
            min = minOf(min,currCount)
        }

        return min
    }
}