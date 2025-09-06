class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if(needle.isEmpty()){
            return 0
        }

        if(haystack.length<needle.length){
            return -1
        }

        for(i in 0 .. haystack.length-needle.length){
            var isMatch = true
            for(j in 0 until needle.length){
                if(haystack[i+j]!=needle[j]){
                    isMatch = false
                    break
                }
            }
            if(isMatch){
                    return i
                }
        }
        return -1

    }
}