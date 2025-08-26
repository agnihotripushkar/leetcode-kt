fun main() {
    println(solution(mutableListOf(1, 4, 3, 2)))      // 4
    println(solution(mutableListOf(5, 7, 9, 4, 11)))  // 9
}

fun solution(structures: MutableList<Int>): Int {
    var x = Int.MIN_VALUE
    for (item in structures){
        x = maxOf(x,item)
    }
    return x
}