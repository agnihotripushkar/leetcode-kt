class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        var ele1 = 0
        var ele2 = 0
        var count1 = 0
        var count2 = 0
        val ans = mutableListOf<Int>()
        val reqlen = nums.size / 3

        for (num in nums){
            if (num==ele1){
                count1+=1
            }
            else if (num==ele2){
                count2+=1
            }
            else if(count1==0){
                ele1 = num
                count1 = 1
            }

            else if(count2==0){
                ele2 = num
                count2 = 1
            }
            else{
                count1--
                count2--
                }
        }

        count1 = 0
        count2 = 0

        for (num in nums){
            if (num ==ele1){
                count1+=1
            }
             if (num == ele2 && ele1 != ele2){
                count2+=1
            }
        }

        if(count1 > reqlen){
            ans.add(ele1)
        } 

         if(count2 > reqlen && ele1 != ele2){
            ans.add(ele2)
        }
        return ans
    }
}