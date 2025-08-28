class Solution {
    fun sortColors(nums: IntArray): Unit {
        var red = 0
        var white = 0
        var blue = nums.size-1

        while(white <= blue){
            when(nums[white]){
                0 ->{
                    val temp = nums[red]
                    nums[red] = nums[white]
                    nums[white] = temp
                    red++
                    white++
                }
                1 ->{
                    white++
                }
                2 ->{
                    val temp = nums[blue]
                    nums[blue] = nums[white]
                    nums[white] = temp
                    blue--

                }
            }
        }
    }
}