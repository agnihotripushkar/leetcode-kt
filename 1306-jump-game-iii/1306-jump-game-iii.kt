class Solution {
    fun canReach(arr: IntArray, start: Int): Boolean {
        if(start !in arr.indices || arr[start]<0){
            return false
        }
        if(arr[start]==0){
            return true
        }
        val jumpStart = arr[start]
        arr[start] = -arr[start]

        return canReach(arr, start + jumpStart ) || canReach(arr, start - jumpStart)
        
    }
}