class Solution {
    fun countPrefixSuffixPairs(words: Array<String>): Int {
        var pair = 0
        for(i in 0 until words.size){
            for(j in i+1 until words.size){
                val first = words[i]
                val sec = words[j]
                if((sec.length >= first.length) 
                && sec.startsWith(first) 
                && sec.endsWith(first)){
                    pair++
                }
            }
        }
        return pair
    }
}