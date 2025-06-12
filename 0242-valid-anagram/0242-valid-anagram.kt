class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val len1 = s.length
        val len2 = t.length

        if(len1!=len2){
            return false
        }
        val map1 = hashMapOf<Char,Int>()
        val map2 = hashMapOf<Char,Int>()

        for (i in 0 until len1){
            map1[s[i]] = map1.getOrDefault(s[i],0)+1
        }

        for (j in 0 until len2){
            map2[t[j]] = map2.getOrDefault(t[j],0)+1
        }

        if (map1.size!=map2.size){
            return false
        }
        for ((word,count) in map1){
            if (map1[word]!=map2[word]){
                return false
            }
        }
        return true
        
    }
}