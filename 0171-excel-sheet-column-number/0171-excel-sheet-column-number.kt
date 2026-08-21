class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var ans = 0;
        for (char in columnTitle){
            ans = ans * 26 + (char - 'A' +1);
        }
        return ans;
    }
}