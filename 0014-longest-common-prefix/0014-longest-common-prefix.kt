class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val firstString = strs[0]

        for(i in firstString.indices){
            var char = firstString[i]
            for(j in 1 until strs.size){
                if(i >= strs[j].length || strs[j][i]!=char){
                    return firstString.substring(0,i)
                }
            }
        }

        return firstString
        
    }
}