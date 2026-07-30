class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val presize = prerequisites.size
        if(presize == 0) return true

        val adjList = mutableListOf(mutableListOf<Int>())
        for(i in 0 until numCourses){
            adjList.add(mutableListOf())
        } 

        for(i in 0 until presize) {
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1])
        }

        val indegree = IntArray(numCourses)
        for(i in 0 until numCourses) {
            adjList[i].forEach {
                indegree[it]++
            }
        }

        var queue = LinkedList<Int>()
        for(i in 0 until numCourses) {
            if(indegree[i] == 0)
                queue.offer(i)
        }

         var course = 0
        while(!queue.isEmpty()) {
            val k = queue.poll()
            course++
            adjList[k].forEach {
                indegree[it]--
                if(indegree[it] == 0)
                    queue.offer(it)
            }
        }

        if(course == numCourses) 
            return true
        return false


        
    }
}