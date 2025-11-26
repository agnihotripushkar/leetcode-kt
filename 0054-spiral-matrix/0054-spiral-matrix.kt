class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val ans = mutableListOf<Int>();
        var left = 0;
        var right = matrix[0].size;
        var top = 0;
        var bottom = matrix.size;

        while(left < right && top < bottom){
            for(i in left until right)
                ans.add(matrix[top][i]);
            top++
            for(j in top until bottom)
                ans.add(matrix[j][right-1])
            right--

            if(!(left < right && top < bottom)) break

            for(i in (right-1) downTo left)
                ans.add(matrix[bottom-1][i])
            bottom--

            for(j in (bottom-1) downTo top)
                ans.add(matrix[j][left])
            left++
        }

        return ans
        
    }
}