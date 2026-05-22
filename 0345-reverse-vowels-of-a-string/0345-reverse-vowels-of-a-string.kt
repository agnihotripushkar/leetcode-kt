class Solution {
    fun reverseVowels(s: String): String {
        val arr = mutableListOf('a','e','i','o','u','A','E','I','O','U')
        val list = mutableListOf<Char>()
        var ans = ""

        for(ch in s){
            if(arr.contains(ch)){
                list.add(ch)
            }
        }

        var reversIndex = list.size -1

        for(ch in s){
            if(arr.contains(ch)){
                ans += list[reversIndex]
                reversIndex--
            }
            else{
                ans+=ch
            }
        }

        return ans
        
    }
}