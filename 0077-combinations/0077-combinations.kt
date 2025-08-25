class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        val curr = ArrayList<Int>()

        fun dfs(start:Int){
            if(curr.size == k){
                result.add(ArrayList(curr))
                return 
            }

            for(i in start .. n){
                curr.add(i)
                dfs(i+1)
                curr.removeAt(curr.size-1)
            }
        }

        dfs(1)
        return result
        
    }
}