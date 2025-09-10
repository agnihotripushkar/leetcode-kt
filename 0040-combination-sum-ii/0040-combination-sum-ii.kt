class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val n = candidates.size
        val ans = mutableListOf<List<Int>>()
        candidates.sort()

        fun backTrack(start:Int, sum:Int, result:MutableList<Int>){
            if(sum == target){
                ans.add(result.toList())
                return
            }
            if(sum > target || start==n){
                return
            }

            result.add(candidates[start])
            backTrack(start+1,sum+candidates[start],result)

            result.removeLast() 
            var j = start
            while (j<n && candidates[j]==candidates[start]){
                j++
            }
            backTrack(j,sum,result)
        }

        backTrack(0,0,mutableListOf<Int>())
        return ans
    }
}