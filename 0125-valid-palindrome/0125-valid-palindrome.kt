class Solution {
    fun isPalindrome(s: String): Boolean {
        val newString = s.filter{it.isLetterOrDigit()}
                            .map{it.lowercaseChar()}
                            .joinToString("")

        return newString == newString.reversed()
        
    }
}