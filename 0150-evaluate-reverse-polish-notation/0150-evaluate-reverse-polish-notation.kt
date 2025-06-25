class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()

        for(token in tokens){
            when(token){
                "+" -> stack.addLast(stack.removeLast() + stack.removeLast())
                "-" -> { 
                    val x = stack.removeLast()
                    val y = stack.removeLast()
                    stack.addLast(y - x)
                    }
                "*" -> stack.addLast(stack.removeLast() * stack.removeLast())
                "/" -> {
                    val x = stack.removeLast()
                    val y = stack.removeLast()
                    stack.addLast(y/x)
                }
                else -> stack.addLast(token.toInt())
            }
        }
        return stack.removeLast()
    }
}