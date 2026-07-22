class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()
        var greedPtr = 0
        var sizePtr = 0

        while(greedPtr < g.size && sizePtr < s.size){
            if(g[greedPtr] <= s[sizePtr]){
                greedPtr++
            }
            sizePtr++
        }

        return greedPtr
    
    }
}