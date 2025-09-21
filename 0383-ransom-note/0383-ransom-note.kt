class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val hashMap = hashMapOf<Char, Int>()
        for(ch in magazine){
            hashMap[ch] = hashMap.getOrDefault(ch,0) + 1
        }
        for(ch in ransomNote){
            if(hashMap.contains(ch)){
                val count = hashMap.getOrDefault(ch,0)
                if(count==0){
                    return false
                }
                hashMap[ch] = hashMap.getOrDefault(ch,1) - 1
            }
            else{
                return false
            }
        }
        return true
    }
}