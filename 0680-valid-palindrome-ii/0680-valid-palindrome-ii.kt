class Solution {
    fun validPalindrome(s: String): Boolean {
        fun isValidpalindrome(s:String, low:Int, high:Int):Boolean{
            var l = low
            var h = high
            while(l<h){
                if(s[l]!=s[h]){
                    return false
                }
                l+=1
                h-=1
            }
            return true
        }

        var low = 0
        var high = s.length-1
        var lifeline = false

        while(low < high){
            if(s[low]==s[high]){
                low+=1
                high-=1
            }
            else{
                if(isValidpalindrome(s,low+1,high)){
                    return true
                }
                if(isValidpalindrome(s,low,high-1)){
                    return true
                }
                return false
            }
        }
        return true
    }
}