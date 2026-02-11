class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set = mutableSetOf<Int>()
        val res = ArrayList<Int>()
        for(num in nums1){
            set.add(num)
        }
        for(num in nums2){
            if(set.contains(num)){
                res.add(num)
                set.remove(num)
            }
        }
        return res.toIntArray()
    }
}