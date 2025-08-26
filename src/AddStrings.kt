fun main() {
    println(solution("99", "99"))  // 1818
    println(solution("11", "9"))   // 110
    println(solution("7", "123"))  // 1210
}

fun solution(a: String, b: String): String {
    val n = a.length
    val m = b.length
    val len = maxOf(n, m)
    val list = mutableListOf<String>()

    for (i in 0 until len) {
        val no1 = if (n - 1 - i >= 0) a[n - 1 - i] - '0' else 0
        val no2 = if (m - 1 - i >= 0) b[m - 1 - i] - '0' else 0
        val add = no1 + no2
        list.add(add.toString())
    }

    val st = StringBuilder()
    for (i in list.size - 1 downTo 0) {
        st.append(list[i])
    }
    return st.toString()
}