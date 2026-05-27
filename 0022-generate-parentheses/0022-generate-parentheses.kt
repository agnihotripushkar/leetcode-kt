class Solution {
    fun rec(n:Int, open:Int,close:Int, curr:String,res:MutableList<String>){
        if(curr.length == n*2){
            res.add(curr)
            return
        } 

        if(open < n){
            rec(n,open+1,close,curr+"(",res)
        }

        if(close< open){
            rec(n,open,close+1,curr+")",res)
        }
    }

    fun generateParenthesis(n: Int): List<String> {
        val res = mutableListOf<String>()
        rec(n,0,0,"",res)
        return res
    }
}