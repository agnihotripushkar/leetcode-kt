class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {

        fun getSquaredDist(point: IntArray): Long {
            val x = point[0].toLong()
            val y = point[1].toLong()
            return x * x + y * y
        }


        val maxHeap = PriorityQueue<Pair<Long, IntArray>>(k, Comparator { a: Pair<Long, IntArray>, b: Pair<Long, IntArray> ->
            b.first.compareTo(a.first)
        })

        val result = Array(k) { _ -> intArrayOf(0, 0) }

        for (point in points) {
            val dist = getSquaredDist(point)

            if (maxHeap.size < k) {
                maxHeap.add(Pair(dist, point))
            } else {
                if (dist < maxHeap.peek().first) {
                    maxHeap.poll()
                    maxHeap.add(Pair(dist, point))
                }
            }
        }

        for (i in 0 until k) {
            result[i] = maxHeap.poll().second
        }

        return result
    }
}