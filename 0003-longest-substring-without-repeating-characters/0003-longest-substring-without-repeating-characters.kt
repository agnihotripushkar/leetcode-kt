class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val n = s.length
        if (n==0){
            return 0
        }
        var maxLength = 0
        var left = 0
        val charSet = mutableSetOf<Char>()
        for (right in 0 until n){
            while(charSet.contains(s[right])){
                charSet.remove(s[left])
                left++
            }
            charSet.add(s[right])
            maxLength = Math.max(maxLength, right - left + 1)
        }
        return maxLength
    }
}