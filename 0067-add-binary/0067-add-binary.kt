class Solution {
    fun addBinary(a: String, b: String): String {
        var x = a.length -1
        var y = b.length -1
        val builder = StringBuilder()
        var carry = 0
        while(x>=0 || y>=0 || carry ==1){
            val num1 = if (x >= 0) a[x] - '0' else 0
            val num2 = if (y>=0) b[y] - '0' else 0
            val sum = num1 + num2 + carry

            val digit = sum % 2
            carry = sum / 2
            x--
            y--

            builder.append(digit.digitToChar())
        }

        return builder.reverse().toString()
        
    }
}