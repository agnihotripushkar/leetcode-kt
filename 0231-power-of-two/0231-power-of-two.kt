class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if(n==0) return false
        return divide(n)
    }

    fun divide(n:Int):Boolean{
        if(n==1 || n==2) return true
        var no = n
        val div = n % 2
        if(div==0)return divide(no/2)
        else return false
    }
}