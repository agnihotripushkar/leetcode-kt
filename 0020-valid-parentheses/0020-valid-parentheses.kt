class Solution {
    fun isValid(s: String): Boolean {
        val stack = CharArray(s.length)
        var ptr = 0

        for (char in s){
            when(char){
                '(', '[', '{' -> stack[ptr++] = char
                ')' -> if (ptr == 0 || stack[--ptr] != '(') return false
                ']' -> if (ptr == 0 || stack[--ptr] != '[') return false 
                '}' -> if (ptr == 0 || stack[--ptr] != '{') return false 
                else -> return false
                }
            }
        return ptr ==0          
    }
}