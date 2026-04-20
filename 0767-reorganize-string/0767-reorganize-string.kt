class Solution {
    fun reorganizeString(s: String): String {
        val n = s.length
        val counts = mutableMapOf<Char,Int>()
        for(char in s){
            counts[char] = counts.getOrDefault(char,0)+1
        }

        val maxHeap = PriorityQueue<Pair<Char,Int>>{a,b -> b.second - a.second}
        for((char,count) in counts){
            if(count >(n+1)/2 ) return ""
            maxHeap.add(Pair(char,count))
        }

        var prev: Pair<Char, Int>? = null
        val res = StringBuilder()

        while(maxHeap.isNotEmpty()){
            val current = maxHeap.poll()
            res.append(current.first)

            prev?.let{
                if (it.second > 0) {
                    maxHeap.add(it)
                }
            }

            prev = Pair(current.first, current.second - 1)

        }

        return if(s.length == res.length) res.toString() else ""
        
    }
}