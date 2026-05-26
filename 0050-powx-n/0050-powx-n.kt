class Solution {
    fun myPow(x: Double, n: Int): Double {
        var ans = 1.0
        var power = n.toLong()
        var no = x

        if(n<0){
            power = -power
        }

        while(power>0){
            if(power%2==0L){
                no = no * no
                power = power/2
            }
            else{
                ans = ans * no
                power--
            }
        }

        if(n<0){
            ans = 1.0/ans
        }

        return ans
        
    }
}