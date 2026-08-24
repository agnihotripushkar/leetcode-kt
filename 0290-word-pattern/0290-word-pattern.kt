class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val wordsArray = s.split(" ")

        if(wordsArray.size!=pattern.length){
            return false
        }

        val hashMap = hashMapOf<Char,String>()

        val len = wordsArray.size
        for(i in 0 until len){
            if(!hashMap.containsKey(pattern[i]) && 
               !hashMap.containsValue(wordsArray[i])            
             ){
                hashMap[pattern[i]] = wordsArray[i]
            }
            else if(hashMap[pattern[i]] !=wordsArray[i]){
                return false 
            }
        }
        return true
    }
}