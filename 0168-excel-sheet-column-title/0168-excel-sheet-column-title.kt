class Solution {
    fun convertToTitle(columnNumber: Int): String {
        var no = columnNumber;
        val ans = java.lang.StringBuilder();
        while(no>0){
            no = no -1;
            val tempChar = 'A'.toChar() + (no % 26);
            ans.append(tempChar)
            no = no/26;
        } 
        return ans.reverse().toString();
    }
}