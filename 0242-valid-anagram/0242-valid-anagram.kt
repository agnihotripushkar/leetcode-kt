class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length !=t.length) return false
        val map = hashMapOf<Char,Int>()

        s.forEach{char ->
            map[char] = map.getOrDefault(char,0)+1
        }

        t.forEach{
            val count = map[it]
            if (count ==0 || count ==null) return false
            else map[it] = count-1
        }

        return true
        
    }
}