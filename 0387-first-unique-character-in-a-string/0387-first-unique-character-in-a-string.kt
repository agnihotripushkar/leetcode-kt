class Solution {
    fun firstUniqChar(s: String): Int {
        val freqArray = IntArray(26)

        for(char in s){
            freqArray[char - 'a']++
        }
        for(i in 0 until s.length){
            if(freqArray[s[i]-'a']==1){
                return i
            }
        }

        return -1
    }
}