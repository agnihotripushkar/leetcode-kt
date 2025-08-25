class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()

        fun dfs(total:Int, i:Int, curr:ArrayList<Int>){
            if (total==target){
                result.add(ArrayList(curr))
                return
            }
            if(total > target || i>= candidates.size){
                return
            }

            curr.add(candidates[i])
            dfs(total + candidates[i], i, curr)

            curr.removeAt(curr.size -1)
            dfs(total,i+1,curr)
        }

        dfs(0,0,ArrayList<Int>())
        return result
    }
}