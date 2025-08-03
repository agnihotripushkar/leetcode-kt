class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val hmap = mutableMapOf<Int,Int>()

        nums.forEachIndexed{index,item ->
            if(hmap.containsKey(item)){
                val prevIndex = hmap.getValue(item)
                if(index-prevIndex<=k){
                    return true
                }
            }
            hmap[item] = index
        }

        return false
        
    }
}