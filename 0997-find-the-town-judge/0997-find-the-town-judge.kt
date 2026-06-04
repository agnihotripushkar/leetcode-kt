class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        if(n==1) return 1
        val trustCount = IntArray(n+1)

        for(i in 0 until trust.size){
            val people = trust[i]
            trustCount[people[0]] -= 1
            trustCount[people[1]] += 1
        }

        for(i in 0 until n+1){
            if(trustCount[i]== n-1){
                return i
            }
        }

        return -1
        
    }
}