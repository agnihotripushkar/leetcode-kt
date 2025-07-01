class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        for (op in operations) {
            when (op) {
                "D" -> {
                    stack.add(stack.last() * 2)
                }
                "C" -> {
                    stack.removeLast()
                }
                "+" -> {
                    val top = stack.removeLast()
                    val newTop = top + stack.last()
                    stack.add(top)
                    stack.add(newTop)
                }
                else -> {
                    stack.add(op.toInt())
                }
            }
        }
        return stack.sum()   
    }
}