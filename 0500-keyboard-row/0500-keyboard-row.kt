class Solution {
    fun findWords(words: Array<String>): Array<String> {
        val result = mutableListOf<String>()
        val row1 = "qwertyuiop".toSet()
        val row2 = "asdfghjkl".toSet()
        val row3 = "zxcvbnm".toSet()

        for(word in words){
            val lowWord = word.lowercase()
            val set1 = lowWord.toSet()

            if(row1.containsAll(set1) || row2.containsAll(set1) || row3.containsAll(set1)){
                result.add(word)
            }

        }

        return result.toTypedArray()
        
    }
}