class Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val orderMap = HashMap<Char,Int>()

        for(i in order.indices){
            orderMap[order[i]] = i
        }

        fun compare(w1:String,w2:String):Boolean{
            val minLen = minOf(w1.length,w2.length)
            for(i in 0 until minLen){
                if (w1[i]!=w2[i]){
                    val rank1 = orderMap[w1[i]]!!
                    val rank2 = orderMap[w2[i]]!!
                    
                    if(rank1 < rank2){
                        return true
                    }
                    if (rank1 > rank2){
                        return false
                    }
                } 
            }
            return w1.length<=w2.length
        }

        for(i in 0 until words.size -1){
            if(!compare(words[i],words[i+1])){
                return false
            }
        }

        return true
        
    }
}