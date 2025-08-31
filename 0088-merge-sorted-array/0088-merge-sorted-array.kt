class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var poi1 = m-1
        var poi2 = n-1
        var index = m+n-1

        while(poi2>=0){
            if(poi1>=0 && nums1[poi1]>nums2[poi2]){
                nums1[index--] = nums1[poi1--]
            }
            else{
                nums1[index--] = nums2[poi2--] 
            }
        }
    }
}