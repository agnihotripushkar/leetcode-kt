class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()
        backtrack(result,"",0,0,n)
        return result
    }

    fun backtrack(result: MutableList<String>,current:String,
    openBracket:Int,closebracket:Int,n:Int){
        if(current.length == n*2){
            result.add(current)
            return
        }

        if(openBracket<n){
            backtrack(result,current + "(" ,openBracket+1,closebracket,n)
        }

        if(closebracket < openBracket){
            backtrack(result, current+")",openBracket,closebracket+1,n)
        }

    }
}