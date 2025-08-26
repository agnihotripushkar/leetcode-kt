fun main() {
    //add sum no such that right side no is less and left side is also less than itself.
    println(solution(intArrayOf(1, 3, 2, 5, 1))) // 8
    println(solution(intArrayOf(1, 2)))          // 2
    println(solution(intArrayOf(5, 1, 3)))       // 8

}

fun solution(statusReports: IntArray): Int{
    var sum = 0
    val n = statusReports.size

    for(i in 0 until n){
        val leftCheck = (i==0 || statusReports[i]>statusReports[i-1])
        val rightCheck = (i==n-1 || statusReports[i] >statusReports[i+1])

        if(leftCheck && rightCheck){
            sum +=statusReports[i]
        }
    }

    return sum

}