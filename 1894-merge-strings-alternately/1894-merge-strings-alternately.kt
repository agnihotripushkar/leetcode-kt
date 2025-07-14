class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val n1 = word1.length
        val n2 = word2.length
        var p1 =0
        var p2 = 0
        var ans = StringBuilder()

        while(p1<n1 && p2<n2){
            ans.append(word1[p1++]).append(word2[p2++])
        }

        if(p1<n1){
            ans.append(word1.substring(p1))
        }

         if(p2<n2){
            ans.append(word2.substring(p2))
        }

        return ans.toString()
 
    }
}