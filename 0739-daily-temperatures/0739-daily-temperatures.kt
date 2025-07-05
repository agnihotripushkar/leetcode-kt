class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size)
        val stack = Stack<Int>()

        for (i in 0 until temperatures.size){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                val pop = stack.pop()

                result[pop] = i-pop
            }

            stack.push(i)
        }
        return result
    }
}